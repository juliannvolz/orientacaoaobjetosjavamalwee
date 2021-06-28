package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {
	
	private Scanner tec;
	
	public ProgramaPrincipal() {
		tec = new Scanner(System.in);	
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();	
	}

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;
		
		
		do {
			
			System.out.println("--- MENU ---");
			System.out.println("1) Registro de pessoas");
			System.out.println("2) Registro de produtos");
			System.out.println("3) Registro de vendas");
			System.out.println("0) Sair do sistema");
			
			
			int opcao = pessoaController.leOpcao();
			
			switch(opcao) {
				case 1:
					pessoaController.menu(pessoas);
					break;
				
				case 2:
					produtoController.menu(produtos);
					break;
					
				case 3:
					vendaController.menu(vendas, produtos, pessoas);
					break;
					
				case 0:
					sair = true;
					break;
			
				default:
					System.out.println("Opção inválida");
					break;
			}
		}while(!sair);
		
		System.out.println("Sistema finalizado!");
		
	

	}

		
}





