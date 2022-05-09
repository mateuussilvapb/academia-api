package com.mateuussilvapb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.entity.Aluno;
import com.mateuussilvapb.entity.AvaliacaoFisica;
import com.mateuussilvapb.entity.form.AlunoForm;
import com.mateuussilvapb.entity.form.AlunoUpdateForm;
import com.mateuussilvapb.repository.AlunoRepository;
import com.mateuussilvapb.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

	// ======================================================================= //
	@Autowired
	private AlunoRepository repository;

	// ======================================================================= //
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		repository.save(aluno);
		return aluno;
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno.getAvaliacoes();
	}

}
