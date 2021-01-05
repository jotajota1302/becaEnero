package edu.es.eoi.disney;

public class SuperAppPrinter {

	public static void main(String[] args) {
		
		Documento doc= new Documento();
		Impresora.imprimir(doc);
		
		Foto foto= new Foto();
		Impresora.imprimir(foto);

		
	}

}
