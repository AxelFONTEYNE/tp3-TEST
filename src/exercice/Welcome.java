package exercice;

public class Welcome {
	
	private static String premiereLettreMaj(String prenom) {
		char premiereLettre = prenom.charAt(0);
		int asciiPremiereLettre = premiereLettre;
		if(asciiPremiereLettre >= 97 && asciiPremiereLettre <= 122) {
			asciiPremiereLettre = asciiPremiereLettre - 32;
			prenom = prenom.substring(1);
			premiereLettre = (char)asciiPremiereLettre;
			return premiereLettre + prenom;
	    }
		return prenom;
	}
	
	private static boolean prenomValide(String cdc) {
		for(int i = 0; i < cdc.length(); i++) {
			if(cdc.charAt(i) <= 64 || cdc.charAt(i) >= 123 || (cdc.charAt(i) <= 96 && cdc.charAt(i) >= 91)) return false;
		}
		return true;
	}
	
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
	
	private static boolean plusieursPrenoms(String cdc) {
		boolean plusieursPrenoms = false;
		for(int i = 0; i < cdc.length(); i++) {
			if(cdc.charAt(i) == ',') plusieursPrenoms = true;
		}
		return plusieursPrenoms;
	}
	
	public static String chaineDePrenoms(String[] prenoms) {
		String cdp = prenoms[0];
		for(int i = 1; i < prenoms.length; i++) {
			cdp += ", " + prenoms[i];
		}
		return cdp;
	}
	public static String welcome(String prenom) {
		if(prenom == null) return "Hello, my friend";
		if(prenom.length() == 0 || onlySpaces(prenom)) return "Hello, my friend";
		if(onlyMaj(prenom)) return "HELLO, " + prenom + " !";
		String prenoms[] = prenom.split(",");
		if(plusieursPrenoms(prenom)) {
			boolean isMaj = false;
			boolean isMin = false;
			String chaineDePrenoms = "";
			String chaineDePrenomsMaj = "";
			for(int i = 0; i < prenoms.length; i++) {
				if(!prenomValide(prenoms[0]) || !prenomValide(prenoms[i])) return "Erreur dans le prénom";
				if(onlyMaj(prenoms[i])) {
					isMaj = true;
					chaineDePrenomsMaj += prenoms[i] + ", ";
				}else {
					isMin = true;
				    chaineDePrenoms += premiereLettreMaj(prenoms[i]) + ", ";
				}
			}
			
			
			if(isMaj && isMin) {
				chaineDePrenoms = chaineDePrenoms.substring(0,chaineDePrenoms.length()-2);
				chaineDePrenomsMaj = chaineDePrenomsMaj.substring(0,chaineDePrenomsMaj.length()-2);
				return ("Hello, " + chaineDePrenoms + ". AND HELLO, " + chaineDePrenomsMaj + " !");
			}else if(isMaj) {
				chaineDePrenomsMaj = chaineDePrenomsMaj.substring(0,chaineDePrenomsMaj.length()-2);
				return ("HELLO, " + chaineDePrenomsMaj + " !");
			}else {
				chaineDePrenoms = chaineDePrenoms.substring(0,chaineDePrenoms.length()-2);
				return ("Hello, " + chaineDePrenoms);
			}
			
		}
		else {
			if(!prenomValide(prenom)) return "Erreur dans le prénom";
			return ("Hello, " + premiereLettreMaj(prenom) + "");
		}

	
	
		
	}
	
	public static void main(String[] args) {
	   
	}
    
}
