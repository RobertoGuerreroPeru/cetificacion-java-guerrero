package oo_concepts.polimorfismo;

import java.util.ArrayList;

public class PolimorfismoInterfaceClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profesor = new Alumno();
		System.out.println("Profesor: "+profesor.devolverNombre());
		System.out.println("Edad: "+profesor.devolverEdad());
		System.out.println();
		Persona persona = new Alumno();
		System.out.println("Edad: "+persona.devolverEdad());
		System.out.println("Nombre: "+persona.devolverNombre());
		
		Persona persona2 = new Profesor();
		System.out.println("Edad: "+persona2.devolverEdad());
		System.out.println("Nombre: "+persona2.devolverNombre());
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(persona);
		personas.add(persona2);
		
		for (Persona persona3 : personas) {
			System.out.println("ENTRO AL FOR");
			System.out.println("Edad: "+persona3.devolverEdad());
			System.out.println("Nombre: "+persona3.devolverNombre());
		}
	}

}

interface Persona{
	public String devolverNombre();
	
	public int devolverEdad();
}

class Alumno extends Profesor {
	public String devolverNombre(){
		return "Alumno";
	}
	
	public int devolverEdad(){
		return 4;
	}
}

class Profesor implements Persona{
	public String devolverNombre(){
		return "Profesor";
	}
	public int devolverEdad(){
		return 10;
	}
}