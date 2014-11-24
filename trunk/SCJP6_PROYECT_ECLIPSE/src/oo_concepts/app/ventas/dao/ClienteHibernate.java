package oo_concepts.app.ventas.dao;

import oo_concepts.app.ventas.domain.Cliente;

public class ClienteHibernate implements ClienteDao {
	
	public void guardar(Cliente cliente) {
		System.out.println("Cliente id con hibernate: "+cliente.getId());
		System.out.println("Cliente nombre con hibernate: "+cliente.getNombre());
		System.out.println("Cliente dni con hibernate: "+cliente.getDni());
	}
	

}
