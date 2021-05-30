package com.sgh.prontuarioeletronico.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private int prontuario;//gerar automático e sequencial.

    @OneToMany(mappedBy = "paciente")
    private List<Internamento> internamentos = new ArrayList<>();
    private String nomeCompleto;
    private String sexo;
    private LocalDate dataNascimento;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
    //private List<IdadeGestacional> idadeGestacional;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
    //private List<DiasDeUti> dataInternacao;
    private LocalDate dataPrescricao;
    private Double pesoNascimento;
    private Double pesoAnteriar;
    private Double pesoAtual;

    //private Funcionario funucionario;

    //@OneToOne(mappedBy = "paciente")
    //private Setor leito;

    private int idade;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
    //private List<PrescricaoReceituario> prescricaoReceituario;

    private LocalDate dataCadastro = LocalDate.now();
    private LocalTime horaCadastro = LocalTime.now();

    public Paciente(){}

    public Paciente(int prontuario, List<Internamento> internamentos, String nomeCompleto,
                    String sexo, LocalDate dataNascimento, LocalDate dataPrescricao,
                    Double pesoNascimento, Double pesoAnteriar, Double pesoAtual, int idade,
                    LocalDate dataCadastro, LocalTime horaCadastro) {
        this.prontuario = prontuario;
        this.internamentos = internamentos;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.dataPrescricao = LocalDate.now();
        this.pesoNascimento = pesoNascimento;
        this.pesoAnteriar = pesoAnteriar;
        this.pesoAtual = pesoAtual;
        this.idade = idade;
        this.dataCadastro = LocalDate.now();
        this.horaCadastro = LocalTime.now();
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public List<Internamento> getInternamentos() {
        return internamentos;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataPrescricao() {
        return dataPrescricao;
    }

    public void setDataPrescricao(LocalDate dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }

    public Double getPesoNascimento() {
        return pesoNascimento;
    }

    public void setPesoNascimento(Double pesoNascimento) {
        this.pesoNascimento = pesoNascimento;
    }

    public Double getPesoAnteriar() {
        return pesoAnteriar;
    }

    public void setPesoAnteriar(Double pesoAnteriar) {
        this.pesoAnteriar = pesoAnteriar;
    }

    public Double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(Double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }
}
