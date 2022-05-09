package com.mateuussilvapb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateuussilvapb.entity.Matricula;
import com.mateuussilvapb.entity.form.MatriculaForm;
import com.mateuussilvapb.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping(value = "/matriculas")
public class MatriculaController {

	// ======================================================================= //
	@Autowired
	private MatriculaServiceImpl service;

	// ======================================================================= //
	@PostMapping
	public Matricula create(@Valid @RequestBody MatriculaForm form) {
		return service.create(form);
	}

	// ======================================================================= //
	@GetMapping
	public List<Matricula> getAll() {
		return service.getAll();
	}

}
