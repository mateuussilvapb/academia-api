package com.mateuussilvapb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.entity.Aluno;
import com.mateuussilvapb.entity.AvaliacaoFisica;
import com.mateuussilvapb.entity.form.AvaliacaoFisicaForm;
import com.mateuussilvapb.entity.form.AvaliacaoFisicaUpdateForm;
import com.mateuussilvapb.repository.AlunoRepository;
import com.mateuussilvapb.repository.AvaliacaoFisicaRepository;
import com.mateuussilvapb.service.IAvaliacaoFisicaService;

//======================================================================= //
@Service
public class AvaliacaoFisicaImpl implements IAvaliacaoFisicaService {

	// ======================================================================= //
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	// ======================================================================= //
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacao = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		avaliacao.setAluno(aluno);
		avaliacao.setPeso(form.getPeso());
		avaliacao.setAltura(form.getAltura());
		avaliacaoFisicaRepository.save(avaliacao);
		return avaliacao;
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
