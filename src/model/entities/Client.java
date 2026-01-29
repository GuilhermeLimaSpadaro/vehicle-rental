package model.entities;

public class Client {

	private int id;
	private String name;
	private String document;
	private String phone;

	public Client(int id, String name, String document, String phone) {
		this.id = id;
		this.name = name;
		this.document = document;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}

	public String getDocument() {
		return document;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Cliente | ID: " + id + "| Nome: " + name + "| Documento: " + document + "| Telefone: " + phone + "\n";
	}
}
