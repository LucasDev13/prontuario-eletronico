package com.sgh.prontuarioeletronico.controller;

import com.sgh.prontuarioeletronico.dto.InternamentoDTO;
import com.sgh.prontuarioeletronico.entities.Internamento;
import com.sgh.prontuarioeletronico.services.InternamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/internamentos")
public class InternamentoController {

    @Autowired
    private InternamentoService intService;

    @PostMapping
    public ResponseEntity<InternamentoDTO> insert(@RequestBody InternamentoDTO intDto){
        if(intDto == null){
            System.out.println("Entidade vazia");
        }else {
            intDto = intService.insert(intDto);//não estou passando para a entidade.
        }
        return ResponseEntity.ok().body(intDto);
    }

}
