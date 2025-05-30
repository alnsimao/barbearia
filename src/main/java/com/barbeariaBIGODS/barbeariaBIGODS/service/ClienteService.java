package com.barbeariaBIGODS.barbeariaBIGODS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.barbeariaBIGODS.barbeariaBIGODS.model.ClienteModel;
import com.barbeariaBIGODS.barbeariaBIGODS.repositorio.ClienteRepositorio;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void salvarCliente(ClienteModel cliente) {
		cliente.setSenha(passwordEncoder.encode(cliente.getSenha()));
        clienteRepositorio.save(cliente);
	}
}
