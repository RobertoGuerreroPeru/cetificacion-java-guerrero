package practicando_cualquier_cosa;

public class DeclaracionClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	class Perro{
		
	}

}


class Animal{
	String nombre;
	String raza;
	int edad;
	
	public Animal(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
}

class Perro extends Animal {
	public Perro(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}
}

class Car extends Animal {

	public Car(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}

}

