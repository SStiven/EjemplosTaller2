package com.taller2;

public class FamiliaAnimales {
	public static void main(String args[]) {
		/*Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		animal1.setNombre("Cebra");
		animal1.setGenero("F");
		
		animal2.setNombre("Caballo");
		animal2.setPeso(98.0);
		
		System.out.println(animal1.getNombre() + " se va a casar con " + animal2.getNombre());
		
		animal1.setPareja(animal2);
		animal2.setPareja(animal1);
		
		Familia familia;
		if(!animal1.puedeProcrear()) {
			System.out.println("No se pudo formar familia");
			mostrarResumen(animal2);
			return;
		}
		
		familia = animal1.procrear("Cebrallo");
		familia.imprimir();
		System.out.println(familia.hijo);
		mostrarResumen(animal2);*/
	}

	private static void mostrarResumen(Animal animal2) {
		System.out.println("Total de animales: " + Animal.getTotalAnimales());
		Animal.morir(animal2);
		System.out.println("Nuevo total de animales: " + Animal.getTotalAnimales());
	}
}

/*
if(a > 0) {
	print("a > 0")
}else {
	print("a <= 0")
}
funcion1();


//Equivalente
if(a > 0) {
	print("a > 0")
	funcion1();
	return;
}

print("a <= 0")
funcion1();
*/