package gg.project.service;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

import org.json.simple.parser.ParseException;

import gg.project.storage.*;
import gg.project.model.*;

/**
 * Service principale per gestire i metodi più importanti
 * @author gregorini
 *
 */

@org.springframework.stereotype.Service
public class PrincipalService {
    
	/**
	 * Metodo per ottenere i post dell'account.
	 *
	 * @param url 
	 * @return lista dei post dell'account
	 */
	public List<Record> getRecords(String url) throws ParseException{
		return StorageData.Storing(url);
	}
	
	/**
	 * Metodo per ottenere i metadati.
	 *
	 * @return HashMap di String,String
	 */
	public HashMap<String,String> getMetadata(){
		return Metadata.getIGMetadata();
	}
}
