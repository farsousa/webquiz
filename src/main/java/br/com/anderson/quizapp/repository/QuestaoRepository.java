package br.com.anderson.quizapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.anderson.quizapp.model.Questao;
import br.com.anderson.quizapp.model.Tematica;

public interface QuestaoRepository extends CrudRepository<Questao, Integer> {
	
	List<Questao> findByTematica(Tematica tematica);

}
