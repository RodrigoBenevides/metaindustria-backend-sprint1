package com.fiap.metaindustria.service;

import com.fiap.metaindustria.model.Equipamento;
import com.fiap.metaindustria.repository.EquipamentoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {

	private final EquipamentoRepository repository;

	public EquipamentoService(EquipamentoRepository repository) {
		this.repository = repository;
	}

	public List<Equipamento> listar() {
		return repository.findAll();
	}

	public Equipamento buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Equipamento nao encontrado."));
	}

	public Equipamento salvar(Equipamento equipamento) {
		return repository.save(equipamento);
	}

	public Equipamento atualizar(Long id, Equipamento equipamento) {
		Equipamento equipamentoExistente = buscarPorId(id);
		equipamentoExistente.setNome(equipamento.getNome());
		equipamentoExistente.setSetor(equipamento.getSetor());
		equipamentoExistente.setStatus(equipamento.getStatus());
		equipamentoExistente.setTemperaturaAtual(equipamento.getTemperaturaAtual());
		equipamentoExistente.setDataUltimaManutencao(equipamento.getDataUltimaManutencao());
		return repository.save(equipamentoExistente);
	}

	public void deletar(Long id) {
		Equipamento equipamento = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Equipamento nao encontrado."));
		repository.delete(equipamento);
	}
}
