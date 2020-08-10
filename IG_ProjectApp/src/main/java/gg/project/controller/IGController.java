package gg.project.controller;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import gg.project.service.PrincipalService;
import gg.project.service.UrlService;



@RestController
public class IGController {
	/** 
	 * l'annotazione @Autowired lancia automaticamente il costruttore all'avvio di Spring 
	 */
	@Autowired
	PrincipalService service;
	
	@RequestMapping(value = "/record/data", method = RequestMethod.GET)	
	public ResponseEntity<Object> getRecord(@RequestParam(name="token", defaultValue="IGQVJWRXJ4TG56UmtvSGQ2ZAng4WFN2NEtWUWdGdnZAuM2J5a0FMUVgybXRUYmNWZA0NKbnphZAmFNbXdHS0NSekt0dlpYU2l2RWpoODFwSVo1OFNXQkFEVmJWb0t0YnhyM2VxQmw3b2dBf") String token) throws ParseException
	{
		return new ResponseEntity<>(service.getRecords(UrlService.getUrl(token)), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/record/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadata(){
		return new ResponseEntity<>(service.getMetadata(),HttpStatus.OK);
	}
}		                                