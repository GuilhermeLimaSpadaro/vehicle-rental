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

	/**   **/
	
	@Override
	public void add(Client client) throws ClientException {
		if (clientList.contains(client)) {
			throw new ClientException("Cliente ja cadastrado.");
		}
		clientList.add(client);
	}

	@Override
	public void removeClient(String name) throws ClientException {
		Client find = findClientByName(name);
		clientList.remove(find);
	}

	@Override
	public Client findClientByName(String name) throws ClientException {
		if (clientList.isEmpty()) {
			throw new ClientException("Lista nao pode ser vazia!");
		}
		Client find = null;
		for (Client clientObj : clientList) {
			if (clientObj.getName().equals(name)) {
				find = clientObj;
			}
		}
		if (find == null) {
			throw new ClientException("Cadastro nao encontrado: " + name);
		}
		return find;
	}

	@Override
	public String listClients() throws ClientException {
		if (clientList.isEmpty()) {
			throw new ClientException("Lista nao pode ser vazia!");
		}
		StringBuilder sb = new StringBuilder();
		for (Client client : clientList) {
			sb.append(client.toString());
		}
		return sb.toString();
	}
}
