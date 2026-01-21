package model.entities;

import java.util.Objects;

public class Holder {
	private String name;
	private String cpf;

	public Holder(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + ", " + getName() + "CPF:";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Holder other = (Holder) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(name, other.name);
	}
}
