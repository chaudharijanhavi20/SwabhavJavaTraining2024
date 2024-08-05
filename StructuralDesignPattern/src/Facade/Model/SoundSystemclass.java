package Facade.Model;

public class SoundSystemclass implements SoundSystem{

	@Override
	public void start() {
		System.out.println("Sound system start");
		
	}

	@Override
	public void stop() {
		System.out.println("Sound system stop");
		
	}

	@Override
	public void volume() {
		System.out.println("Sound system volume on");
	}

}
