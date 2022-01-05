package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rents[] rent = new Rents[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n;i++) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rent[room] = new Rents(name, email, room);
		}
		System.out.println("\n\n");
		
		for(int j =0; j<rent.length; j++) {
			if(rent[j]!= null) {
				System.out.println(rent[j].toString());
			}
		}
		
		sc.close();
		
	}

}
