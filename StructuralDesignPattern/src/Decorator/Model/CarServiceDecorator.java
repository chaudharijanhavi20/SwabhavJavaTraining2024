package Decorator.Model;

public abstract class CarServiceDecorator implements ICarService {
	private ICarService carservice;

	public CarServiceDecorator(ICarService carservice) {
		super();
		this.carservice = carservice;
	}

	public double getCost() {
		return carservice.getCost();
	}
}
