package Facade.Model;

public class Projectorclass implements Projector{

	@Override
	public void on() {
	System.out.println("projector on");
	}

	@Override
	public void off() {
		System.out.println("projector off");
		
	}

	@Override
	public void input() {
		System.out.println("projector's input ");
	}

}
