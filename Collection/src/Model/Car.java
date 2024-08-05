package Model;

import java.util.List;

public class Car {
	private int carId;
	private String comapnyName;
	private double price;
	private double mileage;

	public Car(int carId, String comapnyName, double price, double mileage) {
		super();
		this.carId = carId;
		this.comapnyName = comapnyName;
		this.price = price;
		this.mileage = mileage;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getComapnyName() {
		return comapnyName;
	}

	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", comapnyName=" + comapnyName + ", price=" + price + ", mileage=" + mileage
				+ "]";
	}

	public static Car findCarWithMaxMileage(List<Car> cars) {
		if (cars == null || cars.isEmpty()) {
			return null;
		}

		Car carWithMaxMileage = cars.get(0);
		for (Car car : cars) {
			if (car.getMileage() > carWithMaxMileage.getMileage()) {
				carWithMaxMileage = car;
			}
		}
		return carWithMaxMileage;
	}
}
