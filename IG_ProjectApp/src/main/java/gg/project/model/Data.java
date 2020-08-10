package gg.project.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import gg.project.storage.Parser;

/**
 * Classe che ottiene i dati richiesti di ogni post dell'account considerato
 * @author gregorini
 *
 */
public class Data {
        
	public static List<Record> getData(Parser p){
		Record r = null;
		List<Record> lr = new ArrayList<Record>();
		if(p.records.size() > 0)
			for(HashMap<String,Object> hm : p.records)
			{
				r = new Record();
				r.setUsername((String)hm.get("username"));
				r.setCaption((String)hm.get("caption"));
				lr.add(r);				
			}
		return lr;
	}
}
