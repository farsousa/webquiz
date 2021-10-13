package br.com.anderson.quizapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.anderson.quizapp.model.Usuario;
import br.com.anderson.quizapp.repository.UsuarioRepository;

@Repository
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(email);
				
		if (usuario == null) {
			System.out.println("Exceção");
			throw new UsernameNotFoundException("Usuário não encontrado!");
			
		}
		
		System.out.println(usuario.getUsername() + ": " + usuario.getPassword()+ ": "+ usuario.getId()+": "+ usuario.getNome());
		return usuario;
	}
	
	

}
