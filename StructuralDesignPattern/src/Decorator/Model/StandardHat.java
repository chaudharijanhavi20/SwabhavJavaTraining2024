package Decorator.Model;

public class StandardHat implements IHat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 800;
	}

	@Override
	public String getDescription() {
		return "Description of Standard Hat";
	}

}
