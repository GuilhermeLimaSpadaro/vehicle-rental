package model.interfaces;

import model.entities.Client;
import model.exception.ClientException;

public interface ClientInterface {
	
	public void add(Client client) throws ClientException;
	
	public void removeClient(String name) throws ClientException;
	
	public Client findClientByName(String name) throws ClientException;
	
	public String listClients() throws ClientException;
}
