package model.interfaces;

import model.entities.Client;
import model.exception.ClientException;

public interface ClientInterface {
	public void add(Client client) throws ClientException;
}
