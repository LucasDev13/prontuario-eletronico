package com.sgh.prontuarioeletronico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "tb_balancohidricos")
public class BalancoHidrico {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeBH;
    private List<Paciente> pacientes;
    //private List<LiquidoEliminado> liquidoEliminados;
    //private List<LiquidoInfundido> liquidoInfundido;
    //private List<Peso> peso;
    //private List<IdadeGestacional> idadeGestacionais;
    private LocalDateTime dataHoraCriacaoBh;

    public BalancoHidrico(){}

    public BalancoHidrico(Long id, String nomeBH) {
        this.id = id;
        this.nomeBH = nomeBH;
        this.pacientes = new ArrayList<Paciente>();
        this.dataHoraCriacaoBh = LocalDateTime.now();
    }
}
