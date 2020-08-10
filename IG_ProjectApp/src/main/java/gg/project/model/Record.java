package gg.project.model;

import java.util.ArrayList;
import java.util.Date;

public class Record {
	private ArrayList<String> Hashtag;
	private String caption;
	private String username;
	
	public Record() {
		Hashtag=null;
		caption=null;
	}

	public ArrayList<String> getHashtag() {
		return Hashtag;
	}

	public void setHashtag(ArrayList<String> hashtag) {
		Hashtag = hashtag;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption=caption;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
}
