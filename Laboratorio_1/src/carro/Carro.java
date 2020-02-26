package carro;

public abstract class Carro {
	public abstract String tipo();
	
	public void imprimir() {
		System.out.println("Soy un tipo de carro= "+ tipo());
	}
}
