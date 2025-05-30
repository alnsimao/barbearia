package com.barbeariaBIGODS.barbeariaBIGODS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.barbeariaBIGODS.barbeariaBIGODS.model.ClienteModel;
import com.barbeariaBIGODS.barbeariaBIGODS.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	@PostMapping("/cadastro")
    public String cadastrarCliente(@ModelAttribute ClienteModel cliente) {
        clienteService.salvarCliente(cliente);
        return "redirect:/login"; 
    }
	
	

}
