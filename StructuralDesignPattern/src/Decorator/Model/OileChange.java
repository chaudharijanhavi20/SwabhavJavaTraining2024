package Decorator.Model;

public class OileChange extends CarServiceDecorator {

	public OileChange(ICarService carservice) {
		super(carservice);

	}

	public double getCost() {
		return 500 + super.getCost();
	}

}
