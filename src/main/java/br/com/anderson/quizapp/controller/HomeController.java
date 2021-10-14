package br.com.anderson.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.anderson.quizapp.model.Questao;
import br.com.anderson.quizapp.repository.QuestaoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private QuestaoRepository questaoRepository;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		Iterable<Questao> questoes = questaoRepository.findAll();
		model.addAttribute("questoes", questoes);
		return "home";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
