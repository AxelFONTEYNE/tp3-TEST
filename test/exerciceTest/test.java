package exerciceTest;
import static org.junit.Assert.assertEquals;

import exercice.Welcome;

public class test {
	
	public static void testPremiereLettreMaj() {
		assertEquals(Welcome.welcome("Bob"), "Hello, Bob");
	}
	
	public static void testPremiereLettreMin() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	public static void testPasUneLettre() {
		assertEquals(Welcome.welcome("8ob"), "Erreur dans le prénom");
	}
	
	public static void testCdcVide() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
	}
	
	public static void testQueDesEspaces() {
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
	}
	
	public static void testCdcNull() {
		assertEquals(Welcome.welcome(null), "Hello, my friend");
	}
	
	public static void testPrenomMaj() {
		assertEquals(Welcome.welcome("JERRY"), "“HELLO, JERRY !");
	}
	
	public static void main(String[] args) {
		testPremiereLettreMaj();
		testPremiereLettreMin();
		testPasUneLettre();
		testCdcVide();
		testQueDesEspaces();
		testCdcNull();
		testPrenomMaj();
	}

}
