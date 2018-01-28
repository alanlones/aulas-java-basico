package br.com.lonesapps.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.lonesapps.todo.repository.TarefaRepository;

@Controller
public class HomeController {

	@Autowired
	private TarefaRepository tarefas;

	@GetMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("tarefas", tarefas.findAll());
		return "home";
	}

	// @RequestMapping(value = "/ola", method = RequestMethod.GET)
	@GetMapping("/ola/{nome}")
	@ResponseBody
	public String home(@PathVariable String nome) {
		return "Olá, " + nome;
	}

	@GetMapping("/ola2")
	@ResponseBody
	public String home2(@RequestParam(required = true, name = "nomeUsuario") String nome) {
		return "Olá, " + nome;
	}
}
