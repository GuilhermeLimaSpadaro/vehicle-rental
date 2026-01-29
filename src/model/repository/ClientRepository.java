package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entities.Client;
import model.exception.ClientException;
import model.interfaces.ClientInterface;

public class ClientRepository implements ClientInterface {

	private List<Client> clientList = new ArrayList<>();
	
	public ClientRepository() {
	}

	public ClientRepository(List<Client> clientList) {
		this.clientList = clientList;
	}

	public List<Client> getClientList() {
		return clientList;
	}

	@Override
	public void add(Client client) throws ClientException {
		if (clientList.contains(client)) {
			throw new ClientException("Cliente ja cadastrado.");
		}
		clientList.add(client);
	}
}
