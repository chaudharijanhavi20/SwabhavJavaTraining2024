package Facade.Model;

public class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;

	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.soundSystem = soundSystem;
	}

	public void watchMovie(String movie) {
		System.out.println("MOVIE STARTS HERE :");
		projector.on();
		dvdPlayer.on();
		dvdPlayer.start();
		soundSystem.volume();
	}

	public void endMovie() {
		System.out.println("\nMOVIE ENDS HERE :");
		dvdPlayer.stop();
		dvdPlayer.off();
		projector.off();
		
	}
}
