package exerciceTest;
import static org.junit.Assert.assertEquals;

import exercice.exercice;

public class test {
	
	public static void exercice1Test() {
		assertEquals(exercice.exercice1("bob"), "Hello, Bob");
		assertEquals(exercice.exercice1("Bob"), "Hello, Bob");
		assertEquals(exercice.exercice1("8ob"), "Erreur dans le prénom");
	}
	public static void main(String[] args) {
		exercice1Test();
	}

}
