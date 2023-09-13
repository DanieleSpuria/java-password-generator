package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = scan.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String colore = scan.nextLine();
		
		System.out.print("Inserisci il tuo anno di nascita: ");
		int anno = scan.nextInt();
		
		System.out.print("Inserisci il tuo mese di nascita: ");
		int mese = scan.nextInt();
		
		System.out.print("Inserisci il tuo giorno di nascita: ");
		int giorno = scan.nextInt();
		
		String pass = nome + "-" + cognome + "-" + colore + "-" + (anno + mese + giorno);
		System.out.println(pass);
	}
}
