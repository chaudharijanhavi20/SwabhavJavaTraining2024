package Decorator.Model;

public class CarInspection implements ICarService{

	@Override
	public double getCost() {
		return 1000;
	}

}
