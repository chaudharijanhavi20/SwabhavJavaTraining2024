package Facade.Model;

public class DVDPlayerclass implements DVDPlayer{

	@Override
	public void on() {
		System.out.println("DVD Player on :");
		
	}

	@Override
	public void off() {
		System.out.println("DVD Player off ");
		
	}

	@Override
	public void start() {
		System.out.println("DVD Player starts ");
		
	}

	@Override
	public void stop() {
		System.out.println("DVD Player stops ");
		
	}

}
