package br.com.lojadoseuze;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.lojadoseuze.model.Cliente;
import br.com.lojadoseuze.model.Compra;
import br.com.lojadoseuze.model.Produto;
import br.com.lojadoseuze.model.Vendedor;

public class LojaDoSeuZeApplication {

	static ArrayList<Produto> produtos = new ArrayList<>();
	static ArrayList<Compra> compras = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static Vendedor v1 = new Vendedor("José Lima", "121.262.773-30", 1800.0f);
	static Cliente c1 = new Cliente("Julia Marques", "941.348.797-95");

	public static void main(String[] args) {

		Produto p1 = new Produto("P001", "Caderno 200fl", "Papelaria", 17.80f, "");
		Produto p2 = new Produto("P002", "Lápis Preto Nº2", "Papelaria", 0.80f, "");
		Produto p3 = new Produto("P003", "Roteador Wireless", "Eletrônicos", 64.90f, "");
		Produto p4 = new Produto("P004", "Pen Drive 32GB", "Eletrônicos", 59.90f, "");
		produtos.addAll(Arrays.asList(p1, p2, p3, p4));

		Compra compra = new Compra();
		compra.setCliente(c1);
		compra.setVendedor(v1);
		compra.addProduto(p1, 2);
		compra.addProduto(p2, 15);
		compra.addProduto(p3, 1);
		compra.addProduto(p4, 1);
		compras.add(compra);
		// compra.imprimirRelatorio();

		loop: do {
			switch (mostrarMenu()) {
			case "1":
				cadastroDeProduto();
				break;
			case "2":
				listarProdutos();
				break;
			case "3":
				novaCompra();
				break;
			case "0":
				break loop;
			default:
				break;
			}
		} while (true);

		// scanner.close();
	}

	public static String mostrarMenu() {
		System.out.println("------- Menu -------");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Listar Produtos");
		System.out.println("3 - Nova Compra");
		System.out.println("0 - Sair");
		String opcao = scanner.nextLine();
		return opcao;
	}

	public static void cadastroDeProduto() {
		System.out.println("------- Cadastro de Produto -------");
		Produto produto = new Produto();
		System.out.println("Informe o código: ");
		produto.setCodigo(scanner.nextLine());
		System.out.println("Informe o nome:");
		produto.setNome(scanner.nextLine());
		System.out.println("Informe a categoria:");
		produto.setCategoria(scanner.nextLine());
		System.out.println("Informe o preço: ");
		produto.setPreco(Float.parseFloat(scanner.nextLine()));
		System.out.println("Informe a descrição:");
		produto.setDescricao(scanner.nextLine());
		produtos.add(produto);
	}

	public static void listarProdutos() {
		System.out.println("------- Produtos -------");
		for (Produto p : produtos) {
			p.imprimir();
		}
	}

	public static void novaCompra() {
		Compra compra = new Compra();
		compra.setCliente(c1);
		compra.setVendedor(v1);
		compra.setData(LocalDateTime.now());
		
		String resposta = "s";
		loopCompra : do {
			System.out.println("Informe o código do produto: ");
			String codigo = scanner.nextLine();
			Produto produto = buscarProdutoPorCodigo(codigo);
			
			if(produto == null) {
				System.out.println("Erro - Código inválido!");
				continue loopCompra;
			}
			
			System.out.println("Informe a quantidade: ");
			int quantidade = Integer.parseInt(scanner.nextLine());
			
			compra.addProduto(produto, quantidade);
			
			System.out.println("Deseja inserir novo item ? (s/n)");
			resposta = scanner.nextLine();
		} while (resposta.equalsIgnoreCase("s"));
		
		compras.add(compra);
		compra.imprimirRelatorio();
	}

	public static Produto buscarProdutoPorCodigo(String codigo) {
		for(Produto p : produtos) {
			if(codigo.equalsIgnoreCase(p.getCodigo()))
				return p;
		}
		
		return null;
	}

}

























