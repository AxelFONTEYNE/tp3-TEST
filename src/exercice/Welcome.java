package exercice;

public class Welcome {
	
	private static boolean onlySpaces(String cdc) {
		boolean onlySpaces = true;
		if(cdc.charAt(0) != ' ') onlySpaces = false;
		String cdc2 = cdc;
		while(cdc2.charAt(0) == ' ' && cdc2.length() > 0) {
			if(cdc2.charAt(0) != ' ') onlySpaces = false;
			cdc2.substring(1);
		}
	    return onlySpaces;
	}
	
	private static boolean onlyMaj(String cdc) {
		boolean onlyMaj = true;
		for(int i = 0; i < cdc.length(); i++) {
			if(cdc.charAt(i) < 65 || cdc.charAt(i) > 90)onlyMaj = false;
		}
		return onlyMaj;
	}
	public static String welcome(String prenom) {
		if(prenom.length() == 0 || onlySpaces(prenom)) return "Hello, my friend";
		if(onlyMaj(prenom)) return "HELLO, " + prenom + " !";
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
	
	public static void main(String[] args) {
	    
	}
    
}
