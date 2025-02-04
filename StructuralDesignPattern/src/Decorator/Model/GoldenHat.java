package Decorator.Model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		return hat.getName() + " with Golden Hat";
	}

	@Override
	public double getPrice() {
		return hat.getPrice() + 200;
	}

	@Override
	public String getDescription() {
		return hat.getDescription() + " With golden hat";
	}
}