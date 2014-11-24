package oo_concepts.app.ventas.dao;

import oo_concepts.app.ventas.domain.Cliente;

public class ClienteDaoJDBC implements ClienteDao {

	public void guardar(Cliente cliente) {
		System.out.println("Cliente id: "+cliente.getId());
		System.out.println("Cliente nombre: "+cliente.getNombre());
		System.out.println("Cliente dni: "+cliente.getDni());
	}
	
	

}
