package br.com.anderson.quizapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.anderson.quizapp.model.Banca;
import br.com.anderson.quizapp.model.Questao;
import br.com.anderson.quizapp.model.Tematica;
import br.com.anderson.quizapp.repository.BancaRepository;
import br.com.anderson.quizapp.repository.TematicaRepository;
import br.com.anderson.quizapp.repository.QuestaoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private QuestaoRepository questaoRepository;
	@Autowired
	private BancaRepository bancaRepository;
	@Autowired
	private TematicaRepository tematicaRepository;
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		Iterable<Banca> bancas = bancaRepository.findAll();
		model.addAttribute("bancas", bancas);
		Iterable<Tematica> tematicas = tematicaRepository.findAll();
		model.addAttribute("tematicas", tematicas);
		return "filter";
	}
	
	@GetMapping("/home")
	public String home(@RequestParam String tematica, Model model) {
		Tematica t = tematicaRepository.findByDescricao(tematica);
		Iterable<Questao> questoes = null;
		if (t != null) {
			questoes = questaoRepository.findByTematica(t);			
		}	
		model.addAttribute("questoes", questoes);
		return "home";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
