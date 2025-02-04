package Decorator.Test;

import Decorator.Model.GoldenHat;
import Decorator.Model.PremiumHat;
import Decorator.Model.RibonedHat;
import Decorator.Model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		StandardHat standardHat = new StandardHat();
		PremiumHat premiumHat = new PremiumHat();

		GoldenHat goldenStandardHat = new GoldenHat(standardHat);
		GoldenHat goldenPremium = new GoldenHat(premiumHat);
		RibonedHat ribbonedPremiumHat = new RibonedHat(premiumHat);
		RibonedHat ribbonedStandard = new RibonedHat(standardHat);

		System.out.println(standardHat.getName() + ", Price : " + standardHat.getPrice() + ", Description : "
				+ standardHat.getDescription());
		
		System.out.println("\n" + premiumHat.getName() + ", Price : " + premiumHat.getPrice() + ", Description : "
				+ premiumHat.getDescription());
		
		System.out.println("\n" + goldenStandardHat.getName() + ", Price : " + goldenStandardHat.getPrice()
				+ ", Description : " + goldenStandardHat.getDescription());
		
		System.out.println("\n" + ribbonedStandard.getName() + ", Price : " + ribbonedStandard.getPrice()
				+ ", Description : " + ribbonedStandard.getDescription());
		
		System.out.println("\n" + ribbonedPremiumHat.getName() + ", Price : " + ribbonedPremiumHat.getPrice()
				+ ", Description : " + ribbonedPremiumHat.getDescription());
		
		System.out.println("\n" + goldenPremium.getName() + ", Price : " + goldenPremium.getPrice() + ", Description : "
				+ goldenPremium.getDescription());
	}
}
