package com.taller2;

public class Familia {
	Animal papa;
	Animal mama;
	public Animal hijo;

	public void imprimir() {
		String genero;
		if (hijo.getGenero().equals("M"))
			genero = "masculino";
		else
			genero = "femenino";
		System.out.println(
				papa.getNombre() + " es el papá, " + 
						mama.getNombre() + " es la mamá, y " + hijo.getNombre()
				+ " es el hijo de genero " + genero);
	}
}
