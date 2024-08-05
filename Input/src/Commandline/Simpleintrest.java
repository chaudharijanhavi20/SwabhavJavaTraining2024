package Commandline;

public class Simpleintrest {
	public static void main(String[] args) {
		int Principleamount=Integer.parseInt(args[0]);
		float Rateofintrest=Float.parseFloat(args[1]);
		float numberofyears=Float.parseFloat(args[2]);
		float simpleintrest=Principleamount*Rateofintrest*numberofyears/100;
		System.out.println("Simple intrest on your amount is : "+simpleintrest);
	}

}
