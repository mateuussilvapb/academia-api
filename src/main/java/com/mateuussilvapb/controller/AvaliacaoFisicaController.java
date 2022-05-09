package com.mateuussilvapb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateuussilvapb.entity.AvaliacaoFisica;
import com.mateuussilvapb.entity.form.AvaliacaoFisicaForm;
import com.mateuussilvapb.service.impl.AvaliacaoFisicaImpl;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoFisicaController {

	// ======================================================================= //
	@Autowired
	private AvaliacaoFisicaImpl service;

	// ======================================================================= //
	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
		return service.create(form);
	}
}
