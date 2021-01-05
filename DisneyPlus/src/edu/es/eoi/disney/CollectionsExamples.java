package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsExamples {

	public static void main(String[] args) {

		int[] enteros = new int[10];
		enteros[3] = 5;
		enteros[4] = 4;

		Persona[] personas = new Persona[20];
		personas[11] = new Persona("pepe", "apellidos", "", "");

		// validar apellidos
		for (int i = 0; i < personas.length; i++) {
			
			if (personas[i] == null) {
				break;
			}

			if (personas[i].getNombre().equals("pepe")) {
				System.out.println("pepe encontrado: apellido: " + personas[i].getApellidos());
			}
		}
		
		//Collections
		
		//List Set
		
		List<Integer> enterosList= new ArrayList<Integer>();
		enterosList.add(2);
		enterosList.add(1);
		enterosList.add(2);
		enterosList.remove(Integer.valueOf(2));
		enterosList.remove(Integer.valueOf(2));
		enterosList.set(0, 4);
			
		List<Persona> personasList = new LinkedList<Persona>();
		personasList.add(new Persona("pepe", "apellidos pepe", "", ""));
		personasList.add(new Persona("luis", "apellidos luis", "", ""));
		personasList.add(new Persona("marta", "apellidos marta", "", ""));
		personasList.add(new Persona("pepe", "apellidos pepe", "", ""));
				
		//apellidos de pepe
		
		for (Persona persona : personasList) {
			if("pepe".equals(persona.getNombre())){
//				System.out.println("pepe encontrado: apellido: " + persona.getApellidos());
			}
		}		
		
		for (Persona persona : personasList) {
			System.out.println(persona);
		}
	
		List<Persona> personasLinked= new LinkedList<Persona>();
		personasLinked.add(new Persona("pepe", "apellidos pepe", "", ""));
		personasLinked.add(new Persona("luis", "apellidos luis", "", ""));
		personasLinked.add(new Persona("marta", "apellidos marta", "", ""));
		personasLinked.add(new Persona("pepe", "apellidos pepe", "", ""));
				
		//SET
		
		Set<Persona> personasSet= new HashSet<Persona>();
		personasSet.add(new Persona("pepe", "apellidos pepe", "", ""));
		personasSet.add(new Persona("luis", "apellidos luis", "", ""));
		personasSet.add(new Persona("marta", "apellidos marta", "", ""));
		personasSet.add(new Persona("pepe", "apellidos pepe", "", ""));
				
		for (Persona persona : personasSet) {
			if("pepe".equals(persona.getNombre())){
				System.out.println("pepe encontrado: apellido: " + persona.getApellidos());
			}
		}
		
		//MAP no son COLECCIONES, contienen COLECCIONES
		
		Map<String, Persona> personasMap= new TreeMap<String, Persona>();
		
		Set<String> claves = personasMap.keySet();
		Collection<Persona> values = personasMap.values();
			
		Persona p1=new Persona("pepe", "apellidos pepe","", "12345678-A");
		Persona p2=new Persona("luis", "apellidos luis","", "87654321-A");	
		
		personasMap.put(p1.getNif(),p1 );
		personasMap.put(p2.getNif(),p2 );		
		
		System.out.println(personasMap.get("12345678-A").getApellidos());
		
		for (String nif : claves) {
			System.out.println(nif);			
		}
		for (Persona persona : values) {
			System.out.println(persona.getNombre());			
		}
		
	}

}
