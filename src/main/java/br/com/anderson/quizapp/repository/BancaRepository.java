package br.com.anderson.quizapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.anderson.quizapp.model.Banca;

public interface BancaRepository extends CrudRepository<Banca, Integer>{
	
	Banca findByDescricao(String descricao);

}
