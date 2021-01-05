package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.List;

public class DisneyMain {

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

		System.out.println("Bienvenido a DisneyPlus: ");
		System.out.println("Elige un pelicula: ");

		Actor actor = new Actor("Bruce", "Willis", "1956");
		p1.getActores().add(actor);
		p2.getActores().add(actor);
		p3.getActores().add(actor);

		for (Pelicula film : peliculas) {

			System.out.println(film.getTitulo() + ", year:" + film.getYear());
			alquilar(film);
			reproducir(film);
		}	
		
		for (Serie serie : series) {

			System.out.println(serie.getTitulo() + ", year:" + serie.getYear());
			alquilar(serie);
			reproducir(serie);
		}	

		
		ListaReproduccion<Pelicula> lista= new ListaReproduccion<Pelicula>();
		lista.lista.add(p1);
		
		ListaReproduccion<Serie> series= new ListaReproduccion<Serie>();
		series.lista.add(s1);
		
	}
	
	static void alquilar(Alquilable alquilable) {		
		alquilable.alquilar(2);		
	}
	
	static void reproducir(Reproducible reproducible) {		
		reproducible.reproducir();		
	}

}
