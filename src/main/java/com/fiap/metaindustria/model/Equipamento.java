package com.fiap.metaindustria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Equipamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String setor;
	private String status;
	private Double temperaturaAtual;
	private LocalDate dataUltimaManutencao;

	public Equipamento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTemperaturaAtual() {
		return temperaturaAtual;
	}

	public void setTemperaturaAtual(Double temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}

	public LocalDate getDataUltimaManutencao() {
		return dataUltimaManutencao;
	}

	public void setDataUltimaManutencao(LocalDate dataUltimaManutencao) {
		this.dataUltimaManutencao = dataUltimaManutencao;
	}
}
