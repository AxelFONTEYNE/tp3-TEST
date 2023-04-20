package exercice;

public class exercice {
	public static String exercice1(String prenom) {
		char premiereLettre = prenom.charAt(0);
		int asciiPremiereLettre = premiereLettre;
		if(asciiPremiereLettre >= 97 && asciiPremiereLettre <= 122) {
			asciiPremiereLettre = asciiPremiereLettre - 32;
			prenom = prenom.substring(1);
			premiereLettre = (char)asciiPremiereLettre;
			return ("Hello, " + premiereLettre + prenom + "");
		}else if(asciiPremiereLettre <= 64 || asciiPremiereLettre >= 123 || (asciiPremiereLettre <= 140 && asciiPremiereLettre >= 91)) {
			return ("Erreur dans le prénom");
		}
		else {
			return ("Hello, " + prenom + "");
		}
		
	}
	
	public static String exercice2(String cdc) {
		boolean onlySpaces = true;
		String cdc2 = cdc;
		if(cdc.length() != 0 ) {
			while(cdc2.charAt(0) == ' ' && cdc2.length() > 0) {
				if(cdc2.charAt(0) != ' ') onlySpaces = false;
				cdc2.substring(1);
			}
		}
		
		if(onlySpaces) return "Hello, my friend";
		else return cdc;
	}
	
	
	public static void main(String[] args) {
		exercice1("bob");
	}
    
}
