package FactoryModel;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		ICars car=new Maruti();
		return car;
	}

	

}
