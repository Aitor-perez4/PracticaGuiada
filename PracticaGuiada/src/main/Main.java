package main;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.Athlete;
import domain.Athlete.Genre;
import gui.main.MainWindow;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Athlete> atletas = new ArrayList<Athlete>();
		Athlete a1 = new Athlete(1, "Carlos", Genre.MALE, "Spain", LocalDate.of(1992, 11, 17));
		Athlete a2 = new Athlete(2, "Mary", Genre.FEMALE, "UK", LocalDate.of(1997, 6, 24));
		atletas.add(a1);
		atletas.add(a2);
		
		MainWindow ventana_principal = new MainWindow();

	}
	
}
