package com.sgh.prontuarioeletronico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_setor")
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeSetor;
    private int andar;
    private int sala;
    private int leito;
    //private Paciente paciente;

    public Setor(){}

    public Setor(Long id, String nomeSetor,
                 int andar, int sala, int leito) {
        this.id = id;
        this.nomeSetor = nomeSetor;
        this.andar = andar;
        this.sala = sala;
        this.leito = leito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getLeito() {
        return leito;
    }

    public void setLeito(int leito) {
        this.leito = leito;
    }
}
