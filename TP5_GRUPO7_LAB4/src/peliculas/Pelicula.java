package peliculas;

import java.util.ArrayList;
import java.util.Collections;

public class Pelicula {

	private int id;
	private String nombre;
	private Categoria genero;
	
	private static int contador =0;
	
	
	public Pelicula() {
		contador++; // GENERAMOS ID AUMATICO CADA VEZ QUE QUEREMOS AGREGAR UNA PELICULA
		id = contador;
		this.nombre = "Sin Nombre";
	}
	
	public Pelicula(String nombre, Categoria genero) {
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getGenero() {
		return genero;
	}

	public void setGenero(Categoria genero) {
		this.genero = genero;
	}
	

	@Override
	public String toString() {
		return "Id: " + id + ", Nombre: " + nombre + ", Genero: " + genero;
	}

	
	public ArrayList<Pelicula> ordenarPeliculas(ArrayList<Pelicula> listaPeliculas)
	{
		
		Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> p1.getNombre().compareTo(p2.getNombre()));
		
		return listaPeliculas;
	}
	
		
}
