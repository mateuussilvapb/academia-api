package com.mateuussilvapb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateuussilvapb.entity.Aluno;
import com.mateuussilvapb.entity.AvaliacaoFisica;
import com.mateuussilvapb.entity.form.AlunoForm;
import com.mateuussilvapb.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	// ======================================================================= //
	@Autowired
	private AlunoServiceImpl service;

	// ======================================================================= //
	@GetMapping
	public List<Aluno> getAll() {
		return service.getAll();
	}

	// ======================================================================= //
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return service.create(form);

	}

	// ======================================================================= //
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
		return service.getAllAvaliacaoFisicaId(id);
	}

}
