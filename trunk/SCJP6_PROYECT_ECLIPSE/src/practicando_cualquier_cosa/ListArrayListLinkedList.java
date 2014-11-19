package practicando_cualquier_cosa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArrayListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		declaracionArray();
		Math.ceil(1221);
	}
	
	public static void declaracionArray(){
		Long tiempo;
		List<Persona> listaArray = new ArrayList<Persona>();
		List<Persona> listLinked = new LinkedList<Persona>();
		for(int i=0; i<10000; i++){
			listaArray.add(new Persona(i, "Array "+i, i));
			listLinked.add(new Persona(i, "Linked"+i, i));
		}
		
		System.out.println("Tiempo de inserciòn de array: ");
		tiempo=System.nanoTime();
		listaArray.add(0, new Persona(10001, "Array: "+10001, 10001));
		System.out.println("Tiempo inserciòn array: "+(tiempo-System.nanoTime()));
		
		tiempo = System.nanoTime();
		listLinked.add(0, new Persona(10001, "Linked "+10001, 10001));
		System.out.println("Tiempo mili: "+(tiempo-System.nanoTime()));
		
		
		
	}

}

class Persona{
	int posicion;
	String apellido;
	int edad;
	public Persona(int posicion, String apellido, int edad) {
		super();
		this.posicion = posicion;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
}
