package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisneyMain {

	public static final Scanner scnumero = new Scanner(System.in);
	public static final Scanner sctexto = new Scanner(System.in);
	public static final int SERIE = 1;
	public static final int PELICULA = 2;
	public static final int SALIR = 3;
	static List<Pelicula> peliculas = new ArrayList<Pelicula>();
	static List<Serie> series = new ArrayList<Serie>();

	static Pelicula p1 = new Pelicula("La Jungla de Cristal 1", 120.0, "1985", CategoriaEnum.ACCION);
	static Pelicula p2 = new Pelicula("La Jungla de Cristal 2", 120.0, "1988", CategoriaEnum.ACCION);
	static Pelicula p3 = new Pelicula("La Jungla de Cristal 3", 120.0, "1990", CategoriaEnum.ACCION);

	static Serie s1 = new Serie("The Boys 1", 120.0, "1985", CategoriaEnum.ACCION);
	static Serie s2 = new Serie("The Boys 2", 120.0, "1988", CategoriaEnum.ACCION);

	public static void main(String[] args) {

		peliculas.add(p1);
		peliculas.add(p2);
		peliculas.add(p3);

		series.add(s1);
		series.add(s2);

		System.out.println("Bienvenido a DisneyPlus\n");
		System.out.println("¿Quieres ver una serie o una pelicula?\n"
						+ "1 - Serie\n"
						+ "2 - Pelicula\n"
						+ "3 - Salir\n");

		int metraje = scnumero.nextInt();
		String seleccion = null;
		switch (metraje) {
		case SERIE:
			System.out.println("¿Que serie quieres ver?\n");
			for (Serie film : series) {

				System.out.println(film.getTitulo() + ", year:" + film.getYear());
//	    			alquilar(film);
			}
			System.out.println();
			seleccion = sctexto.nextLine();
			System.out.println();
			for (Serie serie : series) {
				if (seleccion.equalsIgnoreCase(serie.getTitulo())) {
					reproducir(serie);
				}
			}
			break;
		case PELICULA:
			System.out.println("¿Que pelicula quieres ver?");
			for (Pelicula film : peliculas) {

				System.out.println(film.getTitulo() + ", year:" + film.getYear());
//	    			alquilar(film);
			}
			System.out.println();
			seleccion = sctexto.nextLine();
			System.out.println();
			for (Pelicula pelicula : peliculas) {
				if (seleccion.equalsIgnoreCase(pelicula.getTitulo())) {
					reproducir(pelicula);
				}
			}
			break;
		case SALIR:
			break;
		default:
			System.out.println("Opcion erronea");
		}
//		System.out.println("Elige un pelicula: ");

		Actor actor = new Actor("Bruce", "Willis", "1956");
		p1.getActores().add(actor);
		p2.getActores().add(actor);
		p3.getActores().add(actor);

		ListaReproduccion<Pelicula> lista = new ListaReproduccion<Pelicula>();
		lista.lista.add(p1);

		ListaReproduccion<Serie> series = new ListaReproduccion<Serie>();
		series.lista.add(s1);

	}

	static void alquilar(Alquilable alquilable) {
		alquilable.alquilar(2);
	}

	static void reproducir(Reproducible reproducible) {
		reproducible.reproducir();
	}
}
