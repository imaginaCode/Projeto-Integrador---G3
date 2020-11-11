CREATE TABLE `Postagem` (
	`id_postagem` INT NOT NULL AUTO_INCREMENT,
	`id_usuario` INT NOT NULL,
	`id_tema` INT NOT NULL,
	`titulo` varchar(100) NOT NULL,
	`artigo` TEXT(1000) NOT NULL,
	`data` DATETIME NOT NULL DEFAULT '"yyyy-mm-dd"',
	`curtir` BOOLEAN NOT NULL,
	PRIMARY KEY (`id_postagem`)
);

CREATE TABLE `Tema` (
	`id_tema` INT NOT NULL AUTO_INCREMENT,
	id_postagem INT ,
	`nome` varchar(20) NOT NULL ,
	`numero` INT(5000) NOT NULL ,
	`descricao_tema` varchar(300) NOT NULL ,
	PRIMARY KEY (`id_tema`)
	
);

CREATE TABLE `Usuario` (
	`id_usuario` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`email` varchar(20) NOT NULL,
	`senha` varchar(15) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `Comentario` (
	`id_comentario` BINARY NOT NULL AUTO_INCREMENT,
	`id_usuario` INT NOT NULL,
	`id_postagem` INT NOT NULL,
	`artigo` TEXT(1000) NOT NULL,
	`data` DATETIME NOT NULL DEFAULT '"yyyy-mm-dd"',
	`curtir` BOOLEAN NOT NULL,
	PRIMARY KEY (`id_comentario`),
	CONSTRAINT `Postagem_fk2` FOREIGN KEY (`id_usuario`) REFERENCES `Usuario`(`id_usuario`),
	CONSTRAINT `Postagem_fk3` FOREIGN KEY (`id_postagem`) REFERENCES `Postagem`(`id_postagem`)
);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `Usuario`(`id_usuario`);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk1` FOREIGN KEY (`id_tema`) REFERENCES `Tema`(`id_tema`);

