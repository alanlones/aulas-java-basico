package br.com.lojadoseuze.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Compra {
	private Long numero;
	private LocalDateTime data;
	private boolean entrega;
	private Vendedor vendedor;
	private Cliente cliente;
	private List<Item> items = new ArrayList<>();

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	public List<Item> getItems() {
		return items;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addProduto(Produto produto, int quantidade) {
		items.add(new Item(produto, quantidade));
	}

	public float getValorTotal() {
		float soma = 0f;
		for (Item i : items)
			soma += i.getValorTotal();
		return soma;
	}

	public float getValorImpostos() {
		return getValorTotal() * Constantes.IMPOSTOS;
	}

	public float getValorComissao() {
		return getValorTotal() * Constantes.COMISSAO;
	}

	public void imprimirRelatorio() {
		System.out.println("------------ Cumpom Fiscal ------------");
		System.out.println("- Loja do Seu Zé - 17.222.892/0001-78");
		System.out.println("- Vendedor: " + vendedor.getNome());
		System.out.println("- Cliente: " + cliente.getNome());
		System.out.println("---------------- Items ----------------");
		
		
		for(Item i : items)
			System.out.println("- " + i.getProduto().getNome() + "...." + i.getQuantidade() + " X " + i.getProduto().getPreco() + " = " + i.getValorTotal());
		
		System.out.println("---------------------------------------");
		System.out.println("- Valor dos Impostos: R$ " + getValorImpostos());
		System.out.println("- Valor da Comissão: R$ " + getValorComissao());
		System.out.println("- Valor Total: R$ " + getValorTotal());
	}

}

































