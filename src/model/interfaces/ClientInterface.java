package model.interfaces;

import model.exception.ClientServiceException;

public interface ClientInterface {

	public void register(String name, String cpf) throws ClientServiceException;

	public String showInfo();

}
