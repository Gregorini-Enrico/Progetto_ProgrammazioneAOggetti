package gg.project.model;

import java.util.ArrayList;
import java.util.Date;

public class Record {
	private ArrayList<String> Hashtag;
	private String data;
	
	public Record() {
		Hashtag=null;
		data=null;
	}

	public ArrayList<String> getHashtag() {
		return Hashtag;
	}

	public void setHashtag(ArrayList<String> hashtag) {
		Hashtag = hashtag;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
