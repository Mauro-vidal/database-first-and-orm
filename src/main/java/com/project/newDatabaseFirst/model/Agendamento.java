package com.project.newDatabaseFirst.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "agendamentos", schema = "barberpoint")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento", nullable = false)
    private Integer id;

    @Column(name = "servico", nullable = false)
    private String servico;

    @Column(name = "duracao", nullable = false)
    private Integer duracao;

    @Column(name = "data_hora_inicio", nullable = false)
    private Instant dataHoraInicio;

    @Column(name = "data_hora_fim", nullable = false)
    private Instant dataHoraFim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Instant getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Instant dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Instant getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Instant dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

}