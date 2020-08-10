package gg.project.storage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import gg.project.model.Data;
import gg.project.model.Record;

public class StorageData {
    
    public static List<Record> Storing(String url) throws ParseException {
    	//List<Record> dati;
    	Parser p = new Parser();
		try {
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			String data = "";
			String line = "";
		
			try {
				BufferedReader buff = new BufferedReader(new InputStreamReader(in));
				while ( ( line = buff.readLine() ) != null ) {
					data+= line;
				}
			} catch (IOException e) {
				System.out.println("Errore -> Operazione di I/O interrotte");	
				e.printStackTrace();
			} finally {
				in.close();
			}
			
			ObjectMapper obj = new ObjectMapper();
			p = obj.readValue(data, Parser.class);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Data.getData(p);
    }
    
}