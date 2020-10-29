CREATE TABLE `Postagem` (
	`id_postagem` BINARY NOT NULL AUTO_INCREMENT,
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
	`nome` varchar(20) NOT NULL AUTO_INCREMENT,
	`numero` INT(5000) NOT NULL AUTO_INCREMENT,
	`descricao_tema` varchar(300) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id_tema`)
);

CREATE TABLE `Usuario` (
	`id_usuario` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`email` varchar(20) NOT NULL,
	`senha` varchar(15) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `Usuario`(`id_usuario`);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk1` FOREIGN KEY (`id_tema`) REFERENCES `Tema`(`id_tema`);
