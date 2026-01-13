package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Vehicle;
import model.entities.subentities.Car;
import model.entities.subentities.Engine;
import model.entities.subentities.MotorCycle;
import model.entities.subentities.Truck;
import model.exception.DomainException;
import model.exception.VehicleServiceException;
import model.interfaces.ClientInterface;
import model.interfaces.VehicleInterface;
import model.services.ClientServices;
import model.services.VehicleServices;

public class Main {
	public static void main(String[] args) throws DomainException, VehicleServiceException {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)) {
			VehicleInterface vehicleInterface = new VehicleServices();
			ClientInterface clientInterface = new ClientServices();

			System.out.println("Sejam bem vindo!");
			int carMenu = 8;

			while (carMenu != 0) {

				System.out.println("\n* Menu *");
				System.out.println("1. Cadastre-se.");
				System.out.println("2. Cadastrar veiculo.");
				System.out.println("3. Remover veiculo.");
				System.out.println("4. Alugar veiculo.");
				System.out.println("5. Mostre infomacoes do veiculo.");
				System.out.println("6. Mostre informacoes do usuario.");
				System.out.println("0. Sair");
				System.out.print("\nEscolha uma das opcoes: ");
				carMenu = input.nextInt();
				input.nextLine();

				if (carMenu <= -0 && carMenu >= 8) {
					throw new DomainException("Opcao invalida, por favor tente novamente.");
				}

				switch (carMenu) {
				case 1:
					System.out.println("\nInsira os dados de cadastro: ");
					System.out.print("Nome: ");
					String nome = input.nextLine();
					System.out.print("\nCPF: ");
					String cpf = input.nextLine();
					try {
						clientInterface.register(nome, cpf);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					break;
				case 2:
					int optionCarMenu = 4;

					while (optionCarMenu != 0) {
						System.out.println("\nEscolha qual veiculo deseja adicionar.");
						System.out.println("1. Carro.");
						System.out.println("2. Moto.");
						System.out.println("3. Caminhao.");
						System.out.println("0. Sair");
						System.out.print("\nEscolha uma das opcoes acima: ");
						optionCarMenu = input.nextInt();
						input.nextLine();

						switch (optionCarMenu) {

						case 1:

							System.out.println("\nInsira os dados do carro: ");
							System.out.println("ID: ");
							int idCar = input.nextInt();
							input.nextLine();
							System.out.print("Marca: ");
							String mark = input.nextLine();
							System.out.print("Modelo: ");
							String model = input.nextLine();
							System.out.print("Ano: ");
							int year = input.nextInt();
							input.nextLine();
							System.out.print("Valor: ");
							double value = input.nextDouble();
							input.nextLine();
							System.out.print("Portas: ");
							int door = input.nextInt();
							input.nextLine();
							System.out.print("Motor: ");
							String engineType = input.nextLine();
							System.out.print("wHP: ");
							int wHP = input.nextInt();
							input.nextLine();
							Vehicle vehicleCar = new Car(idCar, mark, model, year, value, door,
									new Engine(wHP, engineType));
							vehicleInterface.addCar(vehicleCar);
							break;

						case 2:

							System.out.println("\nInsira os dados da moto: ");
							System.out.println("ID: ");
							int idMotocycle = input.nextInt();
							input.nextLine();
							System.out.print("Marca: ");
							mark = input.nextLine();
							System.out.print("Modelo: ");
							model = input.nextLine();
							System.out.print("Ano: ");
							year = input.nextInt();
							input.nextLine();
							System.out.print("Valor: ");
							value = input.nextDouble();
							input.nextLine();
							System.out.print("Portas: ");
							door = input.nextInt();
							input.nextLine();
							System.out.print("Motor: ");
							engineType = input.nextLine();
							System.out.print("\nwHP: ");
							wHP = input.nextInt();
							input.nextLine();

							Vehicle vehicleMoto = new MotorCycle(idMotocycle, mark, model, year, value, door,
									new Engine(wHP, engineType));
							vehicleInterface.addCar(vehicleMoto);
							break;
						case 3:
							System.out.print("\nInsira os dados do caminhão: ");
							System.out.print("Id: ");
							int idTruck = input.nextInt();
							input.nextLine();
							System.out.print("Marca: ");
							mark = input.nextLine();
							System.out.print("Modelo: ");
							model = input.nextLine();
							System.out.print("Ano: ");
							year = input.nextInt();
							input.nextLine();
							System.out.print("Valor: ");
							value = input.nextDouble();
							input.nextLine();
							System.out.print("Portas: ");
							door = input.nextInt();
							input.nextLine();
							System.out.print("Motor: ");
							engineType = input.nextLine();
							System.out.print("\nwHP: ");
							wHP = input.nextInt();
							input.nextLine();
							Vehicle vehicleTruck = new Truck(idTruck, mark, model, year, value, door,
									new Engine(wHP, engineType));
							vehicleInterface.addCar(vehicleTruck);
							break;
						case 0:
							System.out.println("\nVoltando ao menu");
							break;
						}
					}
					break;
				case 3:
					System.out.println("Insira o veiculo que deseseja remover: ");
					System.out.print("ID do veiculo: ");
					int vehicleId = input.nextInt();
					input.nextLine();
					System.out.print("Marca: ");
					String mark = input.nextLine();
					System.out.print("Modelo: ");
					String model = input.nextLine();
					System.out.print("Ano: ");
					int year = input.nextInt();
					input.nextLine();
					System.out.print("Valor: ");
					double value = input.nextDouble();
					input.nextLine();
					System.out.print("Portas: ");
					int door = input.nextInt();
					input.nextLine();
					System.out.print("Motor: ");
					String engineType = input.nextLine();
					System.out.print("\nwHP: ");
					int wHP = input.nextInt();
					input.nextLine();
					Vehicle remoVehicle = new Vehicle(vehicleId, mark, model, year, value, door,
							new Engine(wHP, engineType));
					vehicleInterface.removeCar(remoVehicle);
				case 4:
					System.out.println("Insira o veiculo que deseja alugar: ");
					vehicleId = input.nextInt();
					input.nextLine();
					System.out.print("Marca: ");
					mark = input.nextLine();
					System.out.print("Modelo: ");
					model = input.nextLine();
					System.out.print("Ano: ");
					year = input.nextInt();
					input.nextLine();
					System.out.print("Valor: ");
					value = input.nextDouble();
					input.nextLine();
					System.out.print("Portas: ");
					door = input.nextInt();
					input.nextLine();
					System.out.print("Motor: ");
					engineType = input.nextLine();
					System.out.print("\nwHP: ");
					wHP = input.nextInt();
					input.nextLine();
					Vehicle rentVehicle = new Vehicle(vehicleId, mark, model, year, value, door,
							new Engine(wHP, engineType));
					vehicleInterface.rentVehicle(rentVehicle);
					break;
				case 5:
					System.out.println("Carregando.. \n");
					System.out.println(vehicleInterface.showInfo());
					break;
				case 6:
					System.out.println("Carregando.. \n");
					System.out.println(clientInterface.showInfo());
					break;
				case 7:
					System.out.println("Insira o nome do carro que deseja achar: ");
					String name = input.next();
					Vehicle v = vehicleInterface.findVehicle(name);
					System.out.println(v);
				case 0:
					break;

				}
			}
		} catch (DomainException e) {
			throw new DomainException("Erro inesperado, tente novamente!");
		}
	}
}