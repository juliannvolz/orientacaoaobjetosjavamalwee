package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class ProdutoController {
	
private Scanner tec;
	
	public ProdutoController() {
		tec = new Scanner(System.in);	
	}
	

	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		System.out.println("--- CADASTRAR PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Valor unitário do produto: R$ ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		return produto;
	}
	
	public List<Produto> listarProduto(List<Produto> produtos) {
		System.out.println("---------------- PRODUTOS CADASTRADOS -------------------");
		
		System.out.printf("| %2s | %10s | %4s | %4s | %4s |\n",
			"Id","Nome", "Valor Unitário", "Quantidade", "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %10s |R$ %12.2f | %10d |R$ %9.2f |\n",
			i,
			produtos.get(i).getNomeDoProduto(),
			produtos.get(i).getValorUnitarioDoProduto(),
			produtos.get(i).getQuantidadeDoProduto(),
			produtos.get(i).getValorTotalDoProduto());
		}
		
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		listarProduto(produtos);
		
		System.out.println("Informe o Id do produto para editar: ");
		int iDProduto = tec.nextInt();
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");
		System.out.println("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("---EDITAR O NOME DO PRODUTO---");
			System.out.println("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());
			
			produto.setQuantidadeDoProduto(produtos.get(iDProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(iDProduto).getValorUnitarioDoProduto());
			
			
			produtos.set(iDProduto, produto);
			break;
			
		case 2:
			System.out.println("---EDITAR A QUANTIDADE DE PRODUTO---");
			System.out.println("Informe a nova quantidade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(iDProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(iDProduto).getValorUnitarioDoProduto());
			
			produtos.set(iDProduto, produto);
			break;
			
		case 3:
			System.out.println("---EDITAR O VALOR UNITÁRIO DO PRODUTO---");
			System.out.println("Informe o novo valor do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(iDProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(iDProduto).getQuantidadeDoProduto());
			
			produtos.set(iDProduto, produto);
			break;
			
		default:
			System.out.println("Opção inválida");
			 break;
		}
		
		
		return produtos;
	}
	
}


























