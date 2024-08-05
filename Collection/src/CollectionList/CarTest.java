package CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Car> cars = new ArrayList<>();
		System.out.print("Enter the number of cars: ");
		int numCars = scanner.nextInt();

		for (int i = 0; i < numCars; i++) {

			System.out.println("\nEnter details for car " + (i + 1));
			System.out.print("Car ID: ");
			int carId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Company Name: ");
			String companyName = scanner.nextLine();
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			System.out.print("Mileage: ");
			double mileage = scanner.nextDouble();
			cars.add(new Car(carId, companyName, price, mileage));
		}

		System.out.println("\nAll Cars:");
		for (Car car : cars) {
			System.out.println(car);
		}

		Car carWithMaxMileage = Car.findCarWithMaxMileage(cars);
		if (carWithMaxMileage != null) {
			System.out.println("\nCar with Maximum Mileage:");
			System.out.println(carWithMaxMileage);
		} else {
			System.out.println("\nNo cars found in the list.");
		}

	}

}
