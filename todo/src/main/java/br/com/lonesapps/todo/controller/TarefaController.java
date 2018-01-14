package br.com.lonesapps.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lonesapps.todo.model.Tarefa;
import br.com.lonesapps.todo.repository.TarefaRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	private TarefaRepository tarefas;

	@GetMapping("/cadastro")
	public String mostrarTelaCadastroTarefa(Tarefa tarefa) {
		return "tarefas/cadastro";
	}

	@GetMapping("/cadastro/{id}")
	public String mostrarTelaCadastroTarefa(@PathVariable Long id, Model model) {
		model.addAttribute("tarefa", tarefas.findOne(id));
		return "tarefas/cadastro";
	}
	
	@GetMapping("/concluir/{id}")
	public String mostrarTelaCadastroTarefa(@PathVariable Long id) {
		Tarefa tarefa = tarefas.findOne(id);
		tarefa.setConcluida(true);
		tarefas.save(tarefa);
		return "redirect:/home";
	}

	@PostMapping("/salvar")
	public String salvarTarefa(Tarefa tarefa) {
		tarefas.save(tarefa);
		return "redirect:/home";
	}
}
