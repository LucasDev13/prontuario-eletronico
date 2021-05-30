package com.sgh.prontuarioeletronico.services;

import com.sgh.prontuarioeletronico.dto.InternamentoDTO;
import com.sgh.prontuarioeletronico.entities.Internamento;
import com.sgh.prontuarioeletronico.repository.InternamentoRepository;
import com.sgh.prontuarioeletronico.util.GeradorRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternamentoService {

    @Autowired
    private InternamentoRepository repository;

    public InternamentoDTO insert(InternamentoDTO internamentoDTO){
        internamentoDTO.setRegistro(GeradorRegistro.geraNumRegistro());
        Internamento entity = new Internamento(internamentoDTO);
        entity = repository.save(entity);
        return new InternamentoDTO(entity);
    }

}
