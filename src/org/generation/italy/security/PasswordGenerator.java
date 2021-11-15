package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Roberta";
		String surname = "Angioni";
		String favouriteColor = "lilla";
		int day = 02;
		int month = 06;
		int year = 1992;
		
		int somma = year + day + month;
		
		//stampa su schermo password
		
		System.out.print("Password: " + name + "-" + surname + "-" + favouriteColor + "-" + somma);

	}

}
