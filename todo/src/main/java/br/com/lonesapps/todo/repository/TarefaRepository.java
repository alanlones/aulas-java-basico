package br.com.lonesapps.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lonesapps.todo.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

	List<Tarefa> findByDescricaoContainingIgnoreCaseAndConcluida(String descricao, Boolean concluida);

}
