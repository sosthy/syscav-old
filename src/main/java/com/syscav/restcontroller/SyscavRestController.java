package com.syscav.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SyscavRestController {
	
	// ----------------------- produire du jSON ------------------------
	@RequestMapping(value = "/chiffres", method = RequestMethod.GET)
	public Map<String, Object> a04() 
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", "un");
		map.put("2", new int[] { 4, 5 });
		return map;
	}
	
}
