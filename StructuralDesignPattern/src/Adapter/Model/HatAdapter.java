package Adapter.Model;

public class HatAdapter implements IItems{
private Hat hat;

public HatAdapter(Hat hat) {
    this.hat = hat;
}
	@Override
	public String getItemName() {
		return hat.getLongName(); 
	}

	@Override
	public double getItemPrice() {
		return hat.getBasePrice()+hat.getTax() ;
				    }
	
}

