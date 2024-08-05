package Tests;
import Models.Enum;
public class EnumTest {
public static void main(String[] args) {
	Enum day=Enum.SATURDAY;
	
	if(day==Enum.SATURDAY) {
		System.out.println("Yay! its almost Sunday!");
	}
	for(Enum myDay : Enum.values()) {
		System.out.println(myDay);
	}
}
}
