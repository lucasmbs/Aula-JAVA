package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;

public class ClienteDao implements IDefaultDao {

	private List<Cliente> clientes;

	public ClienteDao() {
		initMock();
	}

	private void initMock() {
		clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente(1, "Jandeilson", "Nascimento", 30, "99999"));
	}

	public List<Cliente> obterTodosClientes() {
		return this.clientes;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> select() {
		return this.clientes;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}












