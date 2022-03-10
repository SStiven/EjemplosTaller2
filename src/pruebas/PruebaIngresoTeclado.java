package pruebas;

import java.util.Scanner;

import com.taller2.Animal;
import com.taller2.Familia;

public class PruebaIngresoTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("escriba el nombre del animal 1: ");
		String nombreAnimal1 = sc.next();
		
		if(nombreAnimal1 == null || nombreAnimal1.isEmpty()) {
			System.out.println("No se lanza, se informa al usuario");
		}
		
		
		System.out.println("escriba el genero del animal 1: ");
		String generoAnimal1 = sc.next();
		
	
		Animal animal1 = new Animal(nombreAnimal1, generoAnimal1);
		
		
		System.out.println("escriba el nombre del animal 2: ");
		String nombreAnimal2 = sc.next();
		System.out.println("escriba el peso del animal 2: ");
		double pesoAnimal2 = sc.nextDouble();
		Animal animal2 = new Animal(nombreAnimal2, pesoAnimal2);
		
		System.out.println(animal1.getNombre() + " se va a casar con " + animal2.getNombre());
		
		ServicioProcrear servicioProcrear = new ServicioProcrear();
		servicioProcrear.procrear(animal1, animal2);

		sc.close();
		
	}

}
