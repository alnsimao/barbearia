package com.barbeariaBIGODS.barbeariaBIGODS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
	public class LoginController {

	    @GetMapping("/login")
	    public String login() {
	        return "login"; 
	    }
	    @GetMapping("/agendamento")
	    public String agendamentoPage() {
	    	 System.out.println("Redirecionando para a página de agendamento.");
	        return "agendamento"; 
	    }
	
}
