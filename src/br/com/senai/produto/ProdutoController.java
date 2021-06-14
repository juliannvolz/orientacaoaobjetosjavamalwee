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
		
		System.out.print("Valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		return produto;
	}
	
	public List<Produto> listarProduto(List<Produto> produtos) {
		System.out.println("--------------- PRODUTOS CADASTRADOS ------------");
		
		System.out.printf("| %20s | %4s | %4s | %4s |\n",
				"Nome", "Valor Unitário", "Quantidade", "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %20s | %4.2f | %4d | %4.2f |\n",
			produtos.get(i).getNomeDoProduto(),
			produtos.get(i).getValorUnitarioDoProduto(),
			produtos.get(i).getQuantidadeDoProduto(),
			produtos.get(i).getValorTotalDoProduto());
		}
		
		return produtos;
	}
	
}
