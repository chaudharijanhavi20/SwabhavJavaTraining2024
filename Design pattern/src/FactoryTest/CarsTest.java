package FactoryTest;

import FactoryModel.ICars;
import FactoryModel.Mahindra;
import FactoryModel.Maruti;
import FactoryModel.Tata;

public class CarsTest {
public static void main(String[] args) {
	Tata tata=new Tata();
	tata.start();
	tata.stop();
	
	Maruti maruti=new Maruti();
	maruti.start();
	maruti.stop();
	
	Mahindra mahindra=new Mahindra();
	mahindra.start();
	mahindra.stop();
	mahindra.start();
}
}
