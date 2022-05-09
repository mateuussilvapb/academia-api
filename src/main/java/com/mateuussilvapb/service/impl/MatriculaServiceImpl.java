package com.mateuussilvapb.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.entity.Aluno;
import com.mateuussilvapb.entity.Matricula;
import com.mateuussilvapb.entity.form.MatriculaForm;
import com.mateuussilvapb.repository.AlunoRepository;
import com.mateuussilvapb.repository.MatriculaRepository;
import com.mateuussilvapb.service.IMatriculaService;

// ======================================================================= //
@Service
public class MatriculaServiceImpl implements IMatriculaService {

	// ======================================================================= //
	@Autowired
	private AlunoRepository alunoRepository;

	// ======================================================================= //
	@Autowired
	private MatriculaRepository matriculaRepository;

	// ======================================================================= //
	public Matricula create(@Valid MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	// ======================================================================= //
	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
