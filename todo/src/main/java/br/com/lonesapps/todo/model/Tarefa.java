package br.com.lonesapps.todo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "A descrição é obrigatória")
	@NotEmpty(message = "A descrição não pode estar vazia")
	@NotBlank(message = "A descrição não pode ter apenas espaços em branco")
	private String descricao;

	private LocalDate dataFinalizacao;

	private Boolean concluida;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(LocalDate dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public void concluir() {
		this.concluida = true;
		this.dataFinalizacao = LocalDate.now();
	}

}
