package com.sgh.prontuarioeletronico.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.sgh.prontuarioeletronico.entities.Internamento;
import com.sgh.prontuarioeletronico.entities.Paciente;

public class InternamentoDTO {
    private Long id;
    private Long registro;
    private Paciente paciente;
    private LocalDate diasUti;//verifica a data de internação e conta quantos dias está internado.
    private LocalDate dataEntrada;
    private LocalTime horaEntrada;
    private LocalDateTime dataHoraInternamento;

    public InternamentoDTO(){}

    public InternamentoDTO(Long id, Long registro, LocalDate diasUti, LocalDate dataEntrada, Paciente paciente,
                        LocalTime horaEntrada, LocalDateTime dataHoraInternamento) {
        this.id = id;
        this.registro = registro;
        this.paciente = paciente;
        this.diasUti = diasUti;
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
        this.dataHoraInternamento = dataHoraInternamento;
    }

    public InternamentoDTO(Internamento entity){
        id = entity.getId();
        registro = entity.getRegistro();
        paciente = entity.getPaciente();
        diasUti = entity.getDiasUti();
        dataEntrada = entity.getDataEntrada();
        horaEntrada = entity.getHoraEntrada();
        dataHoraInternamento = entity.getDataHoraInternamento();
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

    public void convertDtoToEntity(Internamento entity){
        id = entity.getId();
        registro = entity.getRegistro();
        paciente = entity.getPaciente();
        diasUti = entity.getDiasUti();
        dataEntrada = entity.getDataEntrada();
        horaEntrada = entity.getHoraEntrada();
        dataHoraInternamento = entity.getDataHoraInternamento();
    }
}
