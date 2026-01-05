package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Holder;
import model.exception.ClientServiceException;
import model.interfaces.ClientInterface;

public class ClientServices implements ClientInterface {

	List<Holder> holder = new ArrayList<Holder>();

	public ClientServices(List<Holder> holder) {
		this.holder = holder;
	}

	public ClientServices() {
	}

	public List<Holder> getHolder() {
		return holder;
	}

	public void setHolder(List<Holder> holder) {
		this.holder = holder;
	}

	public void register(String name, String cpf) throws ClientServiceException {

		for (Holder h : holder) {
			if (h.getCpf().equals(cpf)) {
				throw new ClientServiceException("Registrado!");
			}
		}
		holder.add(new Holder(name, cpf));
	}

	public String showInfo() {
		String result = "";
		for (Holder h : holder) {
			result += "Dados do cliente: " + h.getName() + " - " + h.getCpf() + "\n";
		}
		return result;
	}

}
