package gg.project.model;

import java.util.HashMap;

public class Metadata {
       
	public static HashMap<String,String> getIGMetadata(){
		//HashMap in cui le chiavi sono i metadati, i valori la descrizione
		HashMap<String,String> metadati = new HashMap<String,String>();
		metadati.put("username","username dell'utente desiderato");
		metadati.put("caption", "descrizione dei vari post dell'utente");
		return metadati;
	}
}
