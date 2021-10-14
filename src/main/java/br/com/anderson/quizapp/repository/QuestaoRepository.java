package br.com.anderson.quizapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.anderson.quizapp.model.Questao;

public interface QuestaoRepository extends CrudRepository<Questao, Integer> {

}
