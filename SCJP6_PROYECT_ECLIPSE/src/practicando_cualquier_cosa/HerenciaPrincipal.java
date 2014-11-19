package practicando_cualquier_cosa;

public class HerenciaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Carro carro = new Carro();
//		carro.sleep();
//		carro.run();
//		
//		Auto auto = new Auto();
//		auto.sleep();
//		auto.run();
		
		Carro carro2 = new Auto();
		carro2.sleep();
		
	}

}


class Carro{
	int edad;
	String nombre;
	String raza;
	
	public Carro(){
		System.out.println("Constructor Carro");
	}
	
	public void sleep(){
		System.out.println("CArro esta durmiendo...");
	}
	public void run(){
		System.out.println("Carro esta corriendo...");
	}
	
}



class Auto extends Carro{
	
	public Auto(){
		super();
		System.out.println("Contructor Perro");
	}
	
	
//	public void sleep(){
//		System.out.println("Perro esta durmiendo...");
//	}
	
//	public void run(){
//		System.out.println("Perro esta corriendo...");
//	}
	
	
}