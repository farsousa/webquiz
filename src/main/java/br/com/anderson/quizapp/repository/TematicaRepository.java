package br.com.anderson.quizapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.anderson.quizapp.model.Tematica;

public interface TematicaRepository extends CrudRepository<Tematica, Integer>{
	
	Tematica findByDescricao(String descricao);

}
