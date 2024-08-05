package Commandline;

public class Swapper {
   public static void main(String[] args) {
//	   wrapper classes
	   int number1=Integer.parseInt(args[0]);
	   
	   int number2=Integer.parseInt(args[1]);
	   
	   int numberchanged=number1;
	    number1=number2;
	    number2=numberchanged;
	    
	    System.out.println("Your Swapped numbers are :"+number1+ " "+number2);
   }
}
