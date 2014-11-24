package oo_concepts.app.ventas.domain;

public class Cliente {
	private Double id;
	private String nombre;
	private String dni;
	public Cliente(Double id, String nombre, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
