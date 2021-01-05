package edu.es.eoi.disney;

public class Documento implements Imprimible{

	private String texto="sadhfiouasdhfiuoashdfiuhasfd";

	@Override
	public void imprimir() {
		System.out.println("Se imprime el documento con su formato etc...");
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
