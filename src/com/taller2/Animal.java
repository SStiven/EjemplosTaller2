package com.taller2;

public class Animal {
	private String nombre;
	private String genero = "M";
	private double peso;
	private Animal pareja;
	
	private static int totalAnimales;
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	
	public Animal(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
		this.peso = 0;
		totalAnimales++;
	}
	
	public Animal(String nombre, double peso) {
		this.nombre = nombre;
		this.genero = "M";
		this.peso = peso;
		totalAnimales++;
	}
	
	public Animal(String nombre, String genero, double peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.peso = peso;
		totalAnimales++;
	}
	
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getGenero() {
		return genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPareja(Animal pareja) {
	
		this.pareja = pareja;
	}
	
	Animal tenerHijo(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			System.out.println("Se lanza - Bug - no se puede tener un hijo al dar el nombre vacio");
		}
		
		
		double random = Math.random();
		String genero = (random < 0.5) ? "F" : "M";
		Animal hijo = new Animal(nombre, genero, 1);
		totalAnimales++;
		return hijo;
	}
	
	public boolean puedeProcrear() {
		if (pareja == null) {
			System.out.println(this.nombre + " no tiene pareja");
			return false;
		}
		
		if (pareja.genero.equals(genero)) {
			System.out.println(nombre + " y " + pareja.nombre + "son del mismo genero");
			return false;
		}
		
		return true;
	}

	public Familia procrear(String nombreHijo) {
		System.out.println(nombre + " y " + pareja.nombre + " van a tener un hijo");
		Familia f = new Familia();
		
		if (this.genero.equals("M")) {
			f.mama = pareja;
			f.papa = this;
		} else {
			f.mama = this;
			f.papa = this.pareja;
		}
		
		Animal hijo = f.mama.tenerHijo(nombreHijo);
		f.hijo = hijo;
		System.out.println(hijo.nombre + " ha llegado al mundo");
		return f;
	}

	public static void morir(Animal animal) {
		System.out.println(animal.nombre + " ha muerto");
		totalAnimales--;
	}

	public String toString() {
		return "Me llamo " + nombre + " y peso " + peso;
	}

}