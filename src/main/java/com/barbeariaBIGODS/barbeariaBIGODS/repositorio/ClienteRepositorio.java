package com.barbeariaBIGODS.barbeariaBIGODS.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbeariaBIGODS.barbeariaBIGODS.model.ClienteModel;

public interface ClienteRepositorio extends JpaRepository<ClienteModel, Long> {
    ClienteModel findByEmail(String email);
}
