package Facade.Model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {

		return new IndianMenu();

	}

}
