package Decorator.Model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(ICarService carservice) {
		super(carservice);

	}

	public double getCost() {
		return 1500 + super.getCost();
	}
}
