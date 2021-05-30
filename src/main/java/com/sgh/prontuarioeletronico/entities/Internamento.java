package com.sgh.prontuarioeletronico.entities;

import com.sgh.prontuarioeletronico.dto.InternamentoDTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "tb_internamento")
public class Internamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long registro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDate diasUti;
    private LocalDate dataEntrada;
    private LocalTime horaEntrada;
    private LocalDateTime dataHoraInternamento;

    public Internamento(){}

    public Internamento(Long id, Long registro, LocalDate diasUti, LocalDate dataEntrada,
                        LocalTime horaEntrada, LocalDateTime dataHoraInternamento) {
        this.id = id;
        this.registro = registro;
        paciente = new Paciente();
        this.diasUti = diasUti;
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
        this.dataHoraInternamento = dataHoraInternamento;
    }

    public Internamento(InternamentoDTO dto){
        id = dto.getId();
        registro = dto.getRegistro();
        paciente = dto.getPaciente();
        diasUti = dto.getDiasUti();
        dataEntrada = dto.getDataEntrada();
        horaEntrada = dto.getHoraEntrada();
        dataHoraInternamento = dto.getDataHoraInternamento();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getDiasUti() {
        return diasUti;
    }

    public void setDiasUti(LocalDate diasUti) {
        this.diasUti = diasUti;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getDataHoraInternamento() {
        return dataHoraInternamento;
    }

    public void setDataHoraInternamento(LocalDateTime dataHoraInternamento) {
        this.dataHoraInternamento = dataHoraInternamento;
    }
}
