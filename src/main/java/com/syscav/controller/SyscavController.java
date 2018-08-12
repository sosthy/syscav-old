package com.syscav.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SyscavController {

	@RequestMapping("/heure")
	public String heure(Model model)
	{
		// Format de l'heure
		SimpleDateFormat formater = new SimpleDateFormat("HH:MM:ss");
		
		// l'heure du moment
		String heure = formater.format(new Date());
		
		// on met l'heure dans le modèle de la vue
		model.addAttribute("heure", heure);
		
		// on fait afficher la vue [heure.html]
		return "heure";
	}
	
}
