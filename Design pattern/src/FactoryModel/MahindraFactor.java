package FactoryModel;

public class MahindraFactor implements ICarFactory {

	@Override
	public ICars makeCar() {
		ICars car = new Mahindra();
		return car;
	}

}
