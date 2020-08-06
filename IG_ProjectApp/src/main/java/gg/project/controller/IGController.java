package gg.project.controller;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import gg.project.service.PrincipalService;
import gg.project.service.UrlService;
import gg.project.storage.StorageData;


@RestController
public class IGController {
	/** 
	 * l'annotazione @Autowired lancia automaticamente il costruttore all'avvio di Spring 
	 */
	@Autowired
	PrincipalService service;
	
	@RequestMapping(value = "/Record/data", method = RequestMethod.GET)	
	public ResponseEntity<Object> getRecord(@RequestParam(name="token", defaultValue="therealborghez") String token) throws ParseException
	{
		return new ResponseEntity<>(service.getFollower(UrlService.getUrl(token)), HttpStatus.OK);
	}
			                                
}
