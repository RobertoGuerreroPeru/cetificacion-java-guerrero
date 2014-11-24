package oo_concepts.poo_as_a_y_has_a;

//IMPLEMETACION TRANSITIVILIDAD AS-A
public class PooAsAYHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abuelo abuelo = new Padre();

		Padre padre = new Hijo();

		Abuelo abuelo2 = new Hijo();

		Abuelo abuelo3 = new Nieto();

		Padre padre2 = new Nieto();

		Hijo hijo = new Nieto();

	}

}

interface Abuelo {

}

class Padre implements Abuelo {

}

class Hijo extends Padre {

}

class Nieto extends Hijo {

}

//HAS-A
class Carro{
	Ventana v;
	Puertas p;
}
class Ventana{
	
}
class Puertas{
	
}


