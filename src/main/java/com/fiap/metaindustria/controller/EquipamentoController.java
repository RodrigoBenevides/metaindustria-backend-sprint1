package com.fiap.metaindustria.controller;

import com.fiap.metaindustria.model.Equipamento;
import com.fiap.metaindustria.service.EquipamentoService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipamentos")
@CrossOrigin
public class EquipamentoController {

	private final EquipamentoService service;

	public EquipamentoController(EquipamentoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Equipamento> listar() {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Equipamento buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

	@PostMapping
	public Equipamento salvar(@RequestBody Equipamento equipamento) {
		return service.salvar(equipamento);
	}

	@PutMapping("/{id}")
	public Equipamento atualizar(@PathVariable Long id, @RequestBody Equipamento equipamento) {
		return service.atualizar(id, equipamento);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}
