package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.endereco.Endereco;
import br.com.senai.produto.Produto;

public class PessoaController {
	
	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);	
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();	
	}
	
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();	
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDopais(tec.nextLine()); //nextline é para nome composto
		
		System.out.print("Informe a sigla do seu país: ");
		pessoa.setSiglaDopais(tec.nextLine());
		
		System.out.print("Informe o estado: ");
		pessoa.setNomeDoestado(tec.nextLine());
		
		
		System.out.print("Informe a sigla do seu estado: ");
		pessoa.setSiglaDoestado(tec.nextLine());
		
		System.out.print("Informe a sua cidade: ");
		pessoa.setNomeDacidade(tec.nextLine());
		
		System.out.print("Informe o bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe a rua: ");
		pessoa.setRua(tec.nextLine());
		
		System.out.print("Informe o número: ");
		pessoa.setNumero(tec.nextInt());
		
		System.out.print("Informe o complemento: ");
		tec.nextLine();
		pessoa.setComplemento(tec.nextLine());
		
		
		
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--------------- PESSOAS CADASTRADAS ------------");
		
		System.out.printf("| %2s | %20s | %4s | %5s | %6s | %5s | %5s | %10s | %5s | %10s | %10s | %10s | %5s | %10s |\n", 
				"Id","Nome", "Ano", "Idade", "Altura", "País", "Sigla País", "Estado", "Sigla Estado", "Cidade", "Bairro", "Rua", "Número", "Complemento" );
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %5s | %5s | %10s | %5s | %10s | %10s | %10s | %5s | %10s |\n",
					i,
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDopais(),
					pessoas.get(i).getSiglaDopais(),
					pessoas.get(i).getNomeDoestado(),
					pessoas.get(i).getSiglaDoestado(),
					pessoas.get(i).getNomeDacidade(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getNumero(),
					pessoas.get(i).getComplemento());
		}
		
		return pessoas;
	}
	
	public Endereco cadEndereco() {
		Endereco endereco = new Endereco();	
		return endereco;
	}
	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}
		
		System.out.println("Informe o Id da pessoa para editar: ");
		int iDPessoa = tec.nextInt();
		
		System.out.println("1) Nome da pessoa");
		System.out.println("2) Ano de nascimento");
		System.out.println("3) Altura");
		System.out.println("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("---EDITAR O NOME DA PESSOA---");
			System.out.println("Informe o novo nome para editar: ");
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(iDPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(iDPessoa).getAltura());
			pessoa.setNomeDopais(pessoas.get(iDPessoa).getNomeDopais());
			pessoa.setSiglaDopais(pessoas.get(iDPessoa).getSiglaDopais());
			pessoa.setNomeDoestado(pessoas.get(iDPessoa).getNomeDoestado());
			pessoa.setSiglaDoestado(pessoas.get(iDPessoa).getSiglaDoestado());
			pessoa.setNomeDacidade(pessoas.get(iDPessoa).getNomeDacidade());
			pessoa.setBairro(pessoas.get(iDPessoa).getBairro());
			pessoa.setRua(pessoas.get(iDPessoa).getRua());
			pessoa.setNumero(pessoas.get(iDPessoa).getNumero());
			pessoa.setComplemento(pessoas.get(iDPessoa).getComplemento());
			
			pessoas.set(iDPessoa, pessoa);
			
			break;
			
		case 2:
			System.out.println("--- EDITAR ANO DE NASCIMENTO ---");
			System.out.println("Informe o novo ano de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(iDPessoa).getNome());
			pessoa.setAltura(pessoas.get(iDPessoa).getAltura());
			pessoa.setNomeDopais(pessoas.get(iDPessoa).getNomeDopais());
			pessoa.setSiglaDopais(pessoas.get(iDPessoa).getSiglaDopais());
			pessoa.setNomeDoestado(pessoas.get(iDPessoa).getNomeDoestado());
			pessoa.setSiglaDoestado(pessoas.get(iDPessoa).getSiglaDoestado());
			pessoa.setNomeDacidade(pessoas.get(iDPessoa).getNomeDacidade());
			pessoa.setBairro(pessoas.get(iDPessoa).getBairro());
			pessoa.setRua(pessoas.get(iDPessoa).getRua());
			pessoa.setNumero(pessoas.get(iDPessoa).getNumero());
			pessoa.setComplemento(pessoas.get(iDPessoa).getComplemento());
			
			pessoas.set(iDPessoa, pessoa);
			
			break;
			
		case 3:
			System.out.println("--- EDITAR ALTURA ---");
			System.out.println("Informe a nova altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(iDPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(iDPessoa).getAnoDeNascimento());
			pessoa.setNomeDopais(pessoas.get(iDPessoa).getNomeDopais());
			pessoa.setSiglaDopais(pessoas.get(iDPessoa).getSiglaDopais());
			pessoa.setNomeDoestado(pessoas.get(iDPessoa).getNomeDoestado());
			pessoa.setSiglaDoestado(pessoas.get(iDPessoa).getSiglaDoestado());
			pessoa.setNomeDacidade(pessoas.get(iDPessoa).getNomeDacidade());
			pessoa.setBairro(pessoas.get(iDPessoa).getBairro());
			pessoa.setRua(pessoas.get(iDPessoa).getRua());
			pessoa.setNumero(pessoas.get(iDPessoa).getNumero());
			pessoa.setComplemento(pessoas.get(iDPessoa).getComplemento());
			
			pessoas.set(iDPessoa, pessoa);
			
			break;
			
		}
	
		return pessoas;
	}

	public void excluirPessoa(List<Pessoa> pessoas) {
		
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		
		System.out.print("Informe o Id da pessoa para excluir: ");
		int iDPessoa = tec.nextInt();
		
		if(pessoas.size() < iDPessoa) {
			System.out.println("Pessoa não cadastrada");
			return;
		}
		
		pessoas.remove(iDPessoa);
		
		
	}
	
	public void menu(List <Pessoa> pessoas) {
		System.out.println("\n---------- MENU ------------");
		System.out.println("|1) Cadastrar pessoa          ");
		System.out.println("|2) Listar pessoas cadastradas");
		System.out.println("|3) Editar pessoa");
		System.out.println("|4) Excluir pessoa");
		System.out.println("------------------------------");
		
		int opcao = leOpcao();
		
		switch(opcao) {
		case 1:
			cadastrarPessoa();
			break;
			
		case 2:
			listarPessoas(pessoas);
			break;
			
		case 3:
			editarPessoa(pessoas);
			break;
			
		case 4:
			excluirPessoa(pessoas);
			break;
			
		}
	}
		
}
	
	

	

