package Facade.Test;

import Facade.Model.DVDPlayerclass;
import Facade.Model.HomeTheaterFacade;
import Facade.Model.Projectorclass;
import Facade.Model.SoundSystemclass;

public class MovieTest {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new DVDPlayerclass(), new Projectorclass(),
				new SoundSystemclass());
		homeTheater.watchMovie("Kalki");
		homeTheater.endMovie();
	}

}
