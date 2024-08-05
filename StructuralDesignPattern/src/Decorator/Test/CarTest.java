package Decorator.Test;

import Decorator.Model.CarInspection;
import Decorator.Model.ICarService;
import Decorator.Model.OileChange;
import Decorator.Model.WheelAlign;

public class CarTest {
public static void main(String[] args) {
	ICarService car=new CarInspection();
	
	OileChange oil=new OileChange(car);
	
	WheelAlign wheel=new WheelAlign(oil);
	
	System.out.println("Total cost is :"+wheel.getCost());
	
}
}
