package br.com.lonesapps.aulaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lonesapps.aulaweb.repository.Times;

@Controller
public class HomeController {

	@Autowired
	private Times times;

	@GetMapping("/")
	public String mostrarTelaInicial(Model model) {
		model.addAttribute("times", times.buscarTodos());
		return "home";
	}
}
