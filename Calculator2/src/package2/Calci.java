package package2;


import package1.Method;

public class Calci {
	public static void main(String[] args) {
		   Method ans=new Method();
   
		   int a=20;
		   int b=10;
		    
		   int sum=ans.add(a,b);
		   System.out.println("Addition is "+sum);
		   
		   int substraction=ans.sub(a,b);
		   System.out.println("Substraction is "+substraction);
		   
		   int multiplication =ans.mul(a,b);
		   System.out.println("Multiplication is "+multiplication);
		   
		   int division=ans.div(a, b);
		   System.out.println("Division is "+division);
		   
	   }
}
