package br.com.lonesapps.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lonesapps.todo.model.Tarefa;
import br.com.lonesapps.todo.repository.TarefaRepository;

@RestController
@RequestMapping("/api/tarefas")
public class TarefasAPI {

	@Autowired
	private TarefaRepository tarefas;

	@GetMapping
	public List<Tarefa> obterTodasAsTarefas() {
		return tarefas.findAll();
	}

	@GetMapping("{id}")
	public Tarefa obterTarefaPorId(@PathVariable Long id) {
		return tarefas.findOne(id);
	}

	@GetMapping(params = { "descricao", "concluida" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tarefa> pesquisarTarefasPorDescricao(@RequestParam String descricao, @RequestParam Boolean concluida) {
		return tarefas.findByDescricaoContainingIgnoreCaseAndConcluida(descricao, concluida);
	}

	@PostMapping
	public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
		if (tarefa.getConcluida() == null)
			tarefa.setConcluida(false);
		return tarefas.save(tarefa);
	}

	@PutMapping
	public Tarefa alterarTarefa(@RequestBody Tarefa tarefa) {
		if (tarefa.getConcluida() == null)
			tarefa.setConcluida(false);
		return tarefas.save(tarefa);
	}

	@DeleteMapping
	public Tarefa exluirTarefa(@RequestParam Long id) {
		Tarefa tarefa = tarefas.findOne(id);
		tarefas.delete(id);
		return tarefa;
	}

}