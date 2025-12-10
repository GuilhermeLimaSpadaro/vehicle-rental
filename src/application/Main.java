package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Vehicle;
import model.entities.subentities.Car;
import model.entities.subentities.Engine;
import model.entities.subentities.MotorCycle;
import model.entities.subentities.Truck;
import model.exception.DomainException;
import model.interfaces.ClientInterface;
import model.services.ClientServices;
import model.services.VehicleServices;

public class Main {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)) {
			VehicleServices vehicleServices = new VehicleServices();
			Vehicle vehicle00 = new Vehicle();
			ClientInterface client = new ClientServices();
			System.out.println("Sejam bem vindo!");
			int x = 7;

			while (x != 0) {

				System.out.println("\n* Menu *");
				System.out.println("1. Cadastre-se.");
				System.out.println("2. Cadastrar veiculo.");
				System.out.println("3. Remover veiculo.");
				System.out.println("4. Alugar veiculo.");
				System.out.println("5. Mostre infomacoes do veiculo.");
				System.out.println("6. Mostre informacoes do usuario.");
				System.out.println("0. Sair");
				System.out.print("\nEscolha uma das opcoes: ");
				int option = input.nextInt();
				input.nextLine();

				if (x <= -0 && x >= 8) {
					throw new DomainException("Opcao invalida, por favor tente novamente.");
				}

				try {
					switch (option) {
					case 1:
						System.out.println("\nInsira os dados de cadastro: ");
						System.out.print("Nome: ");
						String nome = input.nextLine();
						System.out.print("\nCPF: ");
						String cpf = input.nextLine();
						try {
							client.register(nome, cpf);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}

						break;
					case 2:
						int z = 4;
						while (z != 0) {
							System.out.println("\nEscolha qual veiculo deseja adicionar.");
							System.out.println("1. Carro.");
							System.out.println("2. Moto.");
							System.out.println("3. Caminhao.");
							System.out.println("0. Sair");
							System.out.print("\nEscolha uma das opcoes acima: ");
							z = input.nextInt();
							input.nextLine();
							switch (z) {
							case 1:
								System.out.println("\nInsira os dados do carro: ");
								System.out.print("Marca: ");
								String mark = input.nextLine();
								System.out.print("Modelo: ");
								String model = input.nextLine();
								System.out.print("Ano: ");
								int ano = input.nextInt();
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
								try {
									Vehicle vehicleCar = new Car(mark, model, ano, value, door,
											new Engine(wHP, engineType));
									vehicleServices.addCar(vehicleCar);
								} catch (Exception e) {
									e.getMessage();
								}
								break;
							case 2:
								System.out.println("\nInsira os dados da moto: ");
								System.out.print("Marca: ");
								mark = input.nextLine();
								System.out.print("Modelo: ");
								model = input.nextLine();
								System.out.print("Ano: ");
								ano = input.nextInt();
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
								Vehicle vehicleMoto = new MotorCycle(mark, model, wHP, value, door,
										new Engine(wHP, engineType));
								vehicleServices.addCar(vehicleMoto);
								break;
							case 3:
								System.out.print("\nInsira os dados do caminhão: ");
								System.out.print("Marca: ");
								mark = input.nextLine();
								System.out.print("Modelo: ");
								model = input.nextLine();
								System.out.print("Ano: ");
								ano = input.nextInt();
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
								Vehicle vehicleTruck = new Truck(mark, model, ano, value, door,
										new Engine(wHP, engineType));
								vehicleServices.addCar(vehicleTruck);
								break;
							case 0:
								System.out.println("\nVoltando ao menu");
								break;
							default:
								throw new DomainException("\nVoltando ao menu");
							}
						}
					case 3:
						System.out.println("Insira o veiculo que deseseja remover: ");
						String vehicleName = input.nextLine();
						
						if (vehicle00.getModel().equals(vehicleName)) {
							vehicleServices.removeCar(vehicle00);
						}
						break;
					case 4:
						int c = 4;
						while (c != 0) {

							System.out.println("Escolha qual carro dejesa alugar.");
							System.out.println("Digite o nome do carro dejesado: ");
							String car = input.nextLine();
							if (vehicle00.getModel().equals(car)) {
						    vehicleServices.rentVehicle(vehicle00);
							vehicle00.isRent();
							}else {
								System.out.println("Veiculo alugado.");
							}
							switch (c) {
							case 1:

							case 2:

							default:
								throw new IllegalArgumentException("Unexpected value!");
							}
						}
						break;
					case 5:
						System.out.println("Carregando.. \n");
						System.out.println(vehicleServices.showInfo());
						break;
					case 6:
						System.out.println("Carregando.. \n");
						System.out.println(client.showInfo());
						break;
					case 0:
						break;
					}

				} catch (Exception e) {
					throw new DomainException("Erro no sistema, tente novamente!");
				}
			}
		}
	}
}
