package pruebas;

import com.taller2.Animal;
import com.taller2.Familia;

public class ServicioProcrear {
	
	public Familia procrear(Animal animal1, Animal animal2) {
		animal1.setPareja(animal2);
		animal2.setPareja(animal1);
		
		Familia familia;
		if(!animal1.puedeProcrear()) {
			System.out.println("No se pudo formar familia");
			mostrarResumen(animal2);
			return null;
		}
		
		familia = animal1.procrear("Cebrallo");
		familia.imprimir();
		System.out.println(familia.hijo);
		mostrarResumen(animal2);
		return familia;
	}
	
	private void mostrarResumen(Animal animal2) {
		System.out.println("Total de animales: " + Animal.getTotalAnimales());
		Animal.morir(animal2);
		System.out.println("Nuevo total de animales: " + Animal.getTotalAnimales());
	}

}
