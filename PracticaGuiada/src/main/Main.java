package main;
import domain.Athlete;
import java.time.LocalDate;
import domain.Athlete.Genre;
import gui.main.MainWindow;

public class Main {

	 

	public static void main(String[] args) {
		
		final Athlete[] atletas = {
		new Athlete(1, "López Carlos", Genre.MALE, "Spain", LocalDate.of(1992, 11, 17)),
		new Athlete(2, "Wayne Mary", Genre.FEMALE, "UK", LocalDate.of(1997, 6, 24)),
		new Athlete(3, "Brown Emma", Genre.FEMALE, "Sweden", LocalDate.of(1995, 9, 3)),
		new Athlete(4, "Smith Jack", Genre.MALE, "USA", LocalDate.of(2001, 3, 16)),
		new Athlete(5, "Gómez Paula", Genre.FEMALE, "Spain", LocalDate.of(1999, 1, 29))
		};
		
		MainWindow ventana_principal = new MainWindow(atletas);

		}
	
}
