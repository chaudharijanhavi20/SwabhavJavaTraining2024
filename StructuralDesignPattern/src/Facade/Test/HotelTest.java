package Facade.Test;

import Facade.Model.HotelReception;

public class HotelTest {
	public static void main(String[] args) {
		HotelReception reception=new HotelReception();
		reception.getIndianMenu();
		reception.getItalianHotel();
	}

}
