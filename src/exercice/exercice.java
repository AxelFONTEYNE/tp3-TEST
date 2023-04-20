package exercice;

public class exercice {
	public void exercice1(String prenom) {
		char premiereLettre = prenom.charAt(0);
		int asciiPremiereLettre = premiereLettre;
		if(asciiPremiereLettre >= 97 && asciiPremiereLettre <= 122) {
			asciiPremiereLettre = asciiPremiereLettre - 32;
			prenom = prenom.substring(1);
			premiereLettre = (char)asciiPremiereLettre;
			System.out.println("Hello, " + premiereLettre + prenom + "");
		}else if(asciiPremiereLettre <= 64 || asciiPremiereLettre >= 123 || (asciiPremiereLettre <= 140 && asciiPremiereLettre >= 91)) {
			System.out.println("Erreur dans le prénom");
		}
		else {
			System.out.println("Hello, " + prenom + "");
		}
		
	}
	
	public static void main(String[] args) {
		exercice1("bob");
	}
    
}
