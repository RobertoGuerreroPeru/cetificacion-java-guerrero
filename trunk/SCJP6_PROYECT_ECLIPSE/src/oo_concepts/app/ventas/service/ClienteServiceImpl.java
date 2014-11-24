package oo_concepts.app.ventas.service;

import oo_concepts.app.ventas.dao.ClienteDao;
import oo_concepts.app.ventas.dao.ClienteDaoJDBC;
import oo_concepts.app.ventas.dao.ClienteHibernate;
import oo_concepts.app.ventas.domain.Cliente;

public class ClienteServiceImpl {
	
//	ClienteDaoJDBC clienteDao = new ClienteDaoJDBC();
	ClienteDao clienteHibernate;
	
	
	
	public ClienteDao getClienteHibernate() {
		return clienteHibernate;
	}



	public void setClienteHibernate(ClienteDao clienteHibernate) {
		this.clienteHibernate = clienteHibernate;
	}



	public void guardar(Cliente cliente){
		clienteHibernate.guardar(cliente);
	}
	
	
}
