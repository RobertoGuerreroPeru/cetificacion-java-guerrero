package oo_concepts.encapsulamiento;

//la mala forma de programar esta comentada y la buena es la que queda

//ENCAPSULACIÓN

public class MalaFormaYBuenaFormaVerDiferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno = new Alumno();
//		alumno.apellido="GUERRERO";
		alumno.setNombre("GUERRERO");
	}

}



class Alumno{
//	public String nombre;
//	public String apellido;
	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}