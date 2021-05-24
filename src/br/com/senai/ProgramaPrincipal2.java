package br.com.senai;

public class ProgramaPrincipal2 {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Camaro");
		carro1.setAno(2010);
		carro1.setQtdPortas(2);
		
		carro2.setMarca("Hyundai");
		carro2.setModelo("HB20");
		carro2.setAno(2020);
		carro2.setQtdPortas(4);
		
		carro3.setMarca("Fiat");
		carro3.setModelo("Idea");
		carro3.setAno(2008);
		carro3.setQtdPortas(4);
		
		carro4.setMarca("Hyundai");
		carro4.setModelo("Veloster");
		carro4.setAno(2015);
		carro4.setQtdPortas(3);
		
		carro5.setMarca("Jeep");
		carro5.setModelo("Renegade");
		carro5.setAno(2018);
		carro5.setQtdPortas(4);
		
		System.out.println("--- CARRO 1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		System.out.println("");
		
		System.out.println("--- CARRO 2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		System.out.println("");
		
		System.out.println("--- CARRO 3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		System.out.println("");
		
		System.out.println("--- CARRO 4 ---");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdPortas());
		System.out.println("");
		
		System.out.println("--- CARRO 5 ---");
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getAno());
		System.out.println(carro5.getQtdPortas());
		System.out.println("");
		
		
	}

}
