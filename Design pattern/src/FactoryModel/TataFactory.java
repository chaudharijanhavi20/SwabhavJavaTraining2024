package FactoryModel;

public class TataFactory implements ICarFactory {

	@Override
	public ICars makeCar() {
		ICars car=new Tata();
		return car;
	}

}
