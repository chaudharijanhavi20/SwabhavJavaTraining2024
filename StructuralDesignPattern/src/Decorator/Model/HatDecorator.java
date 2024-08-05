package Decorator.Model;

public abstract class HatDecorator implements IHat {
	public IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

}
