package com.barbeariaBIGODS.barbeariaBIGODS.service;

import com.barbeariaBIGODS.barbeariaBIGODS.model.ClienteModel;
import com.barbeariaBIGODS.barbeariaBIGODS.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User; 
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service 
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        ClienteModel cliente = clienteRepositorio.findByEmail(email);
        if (cliente == null) {
            throw new UsernameNotFoundException("Usuário não encontrado com o e-mail: " + email);
        }
        
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_CLIENTE");
        return new User(cliente.getEmail(), cliente.getSenha(), Collections.singletonList(authority));
    }
}