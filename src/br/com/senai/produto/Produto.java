package br.com.senai.produto;

public class Produto {
	
	
	// ATRIBUTOS
	private String nomeDoProduto;
	private double valorUnitarioDoProduto;
	private int quantidadeDoProduto;
	private double valorTotalDoProduto;
	
	
	
	
	// CONSTRUTOR
	public Produto() {
	}
	
	public Produto(String nomeDoProduto, double valorUnitarioDoProduto, int quantidadeDoProduto,
			double valorTotalDoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
	}
	
	// METODOS
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}
	public void setValorUnitarioDoProduto(double valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		setValorTotalDoProduto();
		
	}
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
		setValorTotalDoProduto();
	}
	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}
	public void setValorTotalDoProduto() {
		this.valorTotalDoProduto = getQuantidadeDoProduto() * getValorUnitarioDoProduto();
	}
	
	
}
