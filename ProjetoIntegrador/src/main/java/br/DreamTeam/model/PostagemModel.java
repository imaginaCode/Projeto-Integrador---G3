package br.DreamTeam.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class PostagemModel 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_postagem;
	
	//CHAVES ESTRANGEIRAS
	@ManyToOne
	@JsonIgnoreProperties({"postagem","comentarios"})
	@NotNull
	private UsuarioModel usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	@NotNull
	private TemaModel tema;
	
	@OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("postagem")
	private List<ComentarioModel> comentarios;
	
	
	
	@Column
	@NotNull
	private String titulo;
	
	@Column
	@NotNull
	private String artigo;//VERIFICAR SE NÃO TEM NENHUM TIPO TEXT
	
	
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date data ;
	
	@Column
	private Boolean curtir;
	
	
	//GETTERS AND SETTERS

	public Long getId_postagem() {
		return Id_postagem;
	}

	public void setId_postagem(Long id_postagem) {
		Id_postagem = id_postagem;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public TemaModel getTema() {
		return tema;
	}

	public void setTema(TemaModel tema) {
		this.tema = tema;
	}

	public List<ComentarioModel> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<ComentarioModel> comentarios) {
		this.comentarios = comentarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getCurtir() {
		return curtir;
	}

	public void setCurtir(Boolean curtir) {
		this.curtir = curtir;
	} 
	
	
	
}
