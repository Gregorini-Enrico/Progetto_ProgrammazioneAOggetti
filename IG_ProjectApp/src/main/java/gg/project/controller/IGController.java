package gg.project.controller;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import gg.project.storage.StorageData;


@RestController
public class IGController {
	@Autowired
	String token="IGQVJWMWd4NFJJZAkhnSzM1NmNMUlNhVFVGVk5tWi00ZA0tQN0lkbGJiUS1KQ1haRlNkS0VCYVJDSUxJNnM5d003eUd1bnBSdWNyNWEwVkpmSWE4alVhX3JMaTZAkNi1PUGxCczRGWjZAn";
	
	StorageData download = new StorageData();
	public void callMe() throws ParseException{
	    download.Storing();
	}

	@RequestMapping(value="/token")
	public ResponseEntity<Object> GetToken(){
		return new ResponseEntity<>(token, HttpStatus.OK);
	}
}
