package br.com.anderson.quizapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true, nullable=false)
	private String descricao;
	
	@OneToMany(mappedBy = "disciplina")
	private List<Tematica> tematicas;
	
	public Disciplina() {		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Tematica> getTematicas() {
		return tematicas;
	}

	public void setTematicas(List<Tematica> tematicas) {
		this.tematicas = tematicas;
	}
 	
}
