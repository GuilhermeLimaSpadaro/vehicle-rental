package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Vehicle;
import model.exception.ClientException;
import model.exception.VehicleException;
import model.interfaces.ClientInterface;
import model.interfaces.VehicleInterface;
import model.repository.ClientRepository;
import model.repository.VehicleRepository;
import model.unums.Categories;

public class Main {

	public static void main(String[] args) throws VehicleException, ClientException {
		Locale.setDefault(Locale.US);
		VehicleInterface vehicleRepo = new VehicleRepository();
		ClientInterface clientRepo = new ClientRepository();
		try (Scanner input = new Scanner(System.in)) {
			boolean running = true;
			while (running) {
				menu();
				switch (intValidation(input)) {
				case 1:
					addClient(input, clientRepo);
					break;
				case 2:
					removeClient(input, clientRepo);
					break;
				case 3:

					break;
				case 4:
					
					break;
				case 5:
					addVehicle(input, vehicleRepo);
					break;
				case 6:
					removeVehicle(input, vehicleRepo);
					break;
				case 7:
					break;
				case 8:
					break;
				case 0:
					break;
				}
			}
		}
	}

	/** inherent methods **/

	public static void menu() {
		System.out.println();
		System.out.println(
				"=========================\r\n" + "       MENU PRINCIPAL\r\n" + "=========================\r\n" + "");
		System.out.println("1. Cadastrar cliente.");
		System.out.println("2. Remover cliente.");
		System.out.println("3. Buscar cliente.");
		System.out.println("4. Listar clientes.");
		System.out.println("5. Cadastrar veiculo.");
		System.out.println("6. Remover veiculo.");
		System.out.println("7. Buscar veiculo.");
		System.out.println("8. Listar veiculos");
		System.out.println("0. Sair.");
		System.out.print("\n Escolha uma das opcoes acima: ");
	}

	public static int intValidation(Scanner input) {
		while (true) {
			try {
				String line = input.nextLine().trim();
				return Integer.parseInt(line);
			} catch (Exception e) {
				System.out.print("Por favor, digite um numero: ");
				continue;
			}
		}
	}

	public static double doubleValidation(Scanner input) {
		while (true) {
			try {
				String line = input.nextLine().trim();
				return Double.parseDouble(line);
			} catch (Exception e) {
				System.out.println("Por favor, digite um numero: ");
				continue;
			}
		}
	}

	public static Categories validationEnum(Scanner input) {
		while (true) {
			try {
				String line = input.nextLine().toUpperCase();
				return Categories.valueOf(line);
			} catch (Exception e) {
				System.out.println("Digite uma categoria! Car | Motocycle | Truck: ");
			}
		}
	}

	public static void addVehicle(Scanner input, VehicleInterface vehicleRepo) throws VehicleException {
		System.out.println();
		System.out.print("ID: ");
		int id = intValidation(input);
		System.out.print("Modelo: ");
		String model = input.nextLine();
		System.out.print("Marca: ");
		String mark = input.nextLine();
		System.out.print("Preco: ");
		double price = doubleValidation(input);
		System.out.print("Placa: ");
		String plate = input.nextLine();
		System.out.println("Categoria: ");
		Categories categories = validationEnum(input);
		Vehicle vehicle = new Vehicle(id, model, mark, price, plate, false, categories);
		vehicleRepo.addVehicle(vehicle);
	}
	
	public static void removeVehicle(Scanner input, VehicleInterface vehicleRepo) throws VehicleException {
		System.out.print("Por favor, insira o modelo do carro que deseja remover: ");
		String model = input.nextLine();
		vehicleRepo.removeVehicle(model);
	}

	public static void addClient(Scanner input, ClientInterface clientRepo) throws ClientException {
		System.out.println();
		System.out.print("ID: ");
		int id = intValidation(input);
		System.out.print("Nome: ");
		String name = input.nextLine();
		System.out.print("CPF: ");
		String document = input.nextLine();
		System.out.println("Telefone: ");
		String phone = input.nextLine();
		Client client = new Client(id, name, document, phone);
		clientRepo.add(client);
	}
	
	public static void removeClient(Scanner input, ClientInterface clientRepo) throws ClientException {
		System.out.println("Por favor, insira o nome que deseja remover: ");
		String name = input.nextLine();
		clientRepo.removeClient(name);
	}
}
