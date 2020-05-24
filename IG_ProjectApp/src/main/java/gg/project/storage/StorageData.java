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

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import gg.project.model.Record;

public class StorageData {
	private String token="IGQVJWMWd4NFJJZAkhnSzM1NmNMUlNhVFVGVk5tWi00ZA0tQN0lkbGJiUS1KQ1haRlNkS0VCYVJDSUxJNnM5d003eUd1bnBSdWNyNWEwVkpmSWE4alVhX3JMaTZAkNi1PUGxCczRGWjZAn";
    private String url="https://graph.instagram.com/me/media?fields=id, caption&access_token="+token;
	private ArrayList<Record> data;
    
    public void Storing() throws ParseException {
    	URLConnection openConnection;
		try {
			openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			String data = "";
			String line = "";
		
			/*try {
				BufferedReader buff = new BufferedReader(new InputStreamReader(in));
				while ( ( line = buff.readLine() ) != null ) {
					data+= line;
				}
				System.out.print(data);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			try (BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream());
			  FileOutputStream fileOS = new FileOutputStream("C:\\Users\\danie\\eclipse-workspace")) {
			    byte data1[] = new byte[1024];
			    int byteContent;
			    while ((byteContent = inputStream.read(data1, 0, 1024)) != -1) {
			        fileOS.write(data1, 0, byteContent);
			    }
			} catch (IOException e) {
			    // handles IO exceptions
			}
			
			JSONObject obj = (JSONObject) JSONValue.parseWithException(data);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    /*public static void downloadURL(String url){
		try (InputStream in = URI.create(url).toURL().openStream()) {
			//Files.copy(in, Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING);
		} catch ( Exception e) {
			//errore in scrittura
		}
	}*/
  
}
