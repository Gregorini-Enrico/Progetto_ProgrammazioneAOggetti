package gg.project.model;

import java.util.ArrayList;
import java.util.Date;

public class Record {
	private ArrayList<String> Hashtag;
	private Date data;
	
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
