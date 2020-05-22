package gg.project.storage;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import gg.project.model.Record;

public class StorageData {
	private String token="IGQVJWMWd4NFJJZAkhnSzM1NmNMUlNhVFVGVk5tWi00ZA0tQN0lkbGJiUS1KQ1haRlNkS0VCYVJDSUxJNnM5d003eUd1bnBSdWNyNWEwVkpmSWE4alVhX3JMaTZAkNi1PUGxCczRGWjZAn";
    private String url="https://graph.instagram.com/me/media?fields=id, media_type, media_url, username, caption, timestamp, like_count&access_token="+token;
	private ArrayList<Record> data;
    
    public void Storing(String url) {
    	URLConnection openConnection;
		try {
			openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
