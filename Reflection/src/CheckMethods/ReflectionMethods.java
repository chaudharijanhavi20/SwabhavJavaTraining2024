package CheckMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionMethods {
public static void main(String[] args) throws ClassNotFoundException{
	Class stringClass=Class.forName("java.lang.string");
	System.out.println(stringClass.getName());
	
	Method StringMethods[]=stringClass.getMethods();
	for(Method methods:StringMethods) {
		System.out.println(methods.getName());
		Parameter parameters[]=methods.getParameters();
	}
	Constructor constructor[]=stringClass.getConstructors();
}
}
