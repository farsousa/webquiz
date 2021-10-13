package br.com.anderson.quizapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.anderson.quizapp.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	public Usuario findByEmail(String email);

}
