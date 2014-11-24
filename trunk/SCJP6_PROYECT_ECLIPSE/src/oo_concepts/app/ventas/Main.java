package oo_concepts.app.ventas;

import oo_concepts.app.ventas.dao.ClienteDaoJDBC;
import oo_concepts.app.ventas.domain.Cliente;
import oo_concepts.app.ventas.service.ClienteServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteServiceImpl clienteServiceImpl = new ClienteServiceImpl();
		clienteServiceImpl.setClienteHibernate(new ClienteDaoJDBC());
		clienteServiceImpl.guardar(new Cliente(98.0,"Arnold","dni"));
		
	}

}
