package flow_control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;




public class Exception {
	static class PQSort implements Comparator<Integer>{
		public int compare(Integer one, Integer two){
			return two-one;
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Arnold", 23);
		Cat cat2 = new Cat("Roberto", 28);
		Cat cat3 = new Cat("Guerrero", 30);
		ArrayList<Cat> cats = new ArrayList<Cat>();
		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		for (Cat cat : cats) {
			System.out.println("Imprimiendo gatos unSorted:  "+cat.nombre);
		}
		try{
			Collections.sort(cats);
		}finally{
			System.out.println("Sucedio un error:");
		}
		
		
		for (Cat cat : cats) {
			System.out.println("Imprimiendo gatos Sorted:  "+cat.nombre);
		}
		
		sortedUnSortedString();
	}
	
	static void sortedUnSortedString(){
		System.out.println("Cantidad de segundos: "+new Hora().devolverHora());
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Arnold");
		strings.add("Roberto");
		strings.add("Guerrero");
		strings.add("Maurioka");
		strings.add("El mejor");
		for (String string : strings) {
			System.out.println("Lista unsorted: "+string);
		}
		Collections.sort(strings);
		for (String string : strings) {
			System.out.println("Lista sorted:  "+string);			
		}
	}
	
	void trabajandoConQueuePriority(){
		int [] ia = {10,2,3,1,9,5,6,7,8};
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (Integer integ : ia) {
			queue.offer(integ);
		}
		
		for (Integer integer : queue) {
			System.out.println("Imprimiendo cada dato: "+integer);
		}
		
		for (Integer integer : ia) {
			System.out.println("Para imprimir en orden de prioridad: "+queue.poll());
		}
		
		
		
		PQSort sort = new PQSort();
		PriorityQueue<Integer> queue2 = new PriorityQueue<>(10,sort);
		for (Integer in : ia){
			queue2.offer(in);
		}
		
		System.out.println("size " + queue2.size());
		System.out.println("peek " + queue2.peek());
		System.out.println("size " + queue2.size());
		System.out.println("poll " + queue2.poll());
		System.out.println("size " + queue2.size());
		System.out.println("poll " + queue2.poll());
		System.out.println("size " + queue2.size());
	}
	
	void doMore(){
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void excepcionFinallyMayor(){
		try{
			int num1=20;
			int num2=0;
			int num3=num1/num2;
			System.out.println("Resultado: "+num3);
		}catch(ArithmeticException e){
//		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Error: "+e.getMessage());
//			System.exit(0);
		}finally{
			System.out.println("Entro al finally");
		}
	}
	
	//método para sentencia FOR_EACH 
	public void forEach(){
		Long [] La = {4L, 5L, 6L};
		long [] la = {7L, 8L, 9L};
		int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
		String [] sNums = {"one", "two", "three"};
		Animal [] animals = {new Dog("Brenda",1), new Cat("Melody",1)};
		// DECLARACIONES LEGALES DE for
		for(long y : la ) 
			System.out.println("valor y: "+y); // loop thru an array of longs
		for(long lp : La) 
			System.out.println("Valor lp: "+lp); // autoboxing the Long objects into longs
		for(int[] n : twoDee){
			for (int i : n) 
				System.out.println("Valor n: "+i); //loop thru the array of arrays
			System.out.println("Paso al siguiente conjunto");
		}
			
			
		for(int n2 : twoDee[2])
			System.out.println("Valor n2: "+n2);  // loop thru the 3rd sub-array
		for(String s : sNums) 
			System.out.println("Valor s: "+s);// loop thru the array of Strings
		for(Object o : sNums) 
			System.out.println("Valor o: "+o); // set an Object reference to
		// each String
		for(Animal a : animals)
			System.out.println("Valor a: edad: "+a.edad + "  nombre: "+a.nombre); // set an Animal reference to each
	}
	
}


class Animal{
	String nombre; 
	int edad;
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
}

class Cat extends Animal implements Comparable<Cat>{

	public Cat(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

class Dog extends Animal{

	public Dog(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

}

class Hora{
	
	public Long devolverHora(){
		return Calendar.getInstance().getTimeInMillis();
	}
}
