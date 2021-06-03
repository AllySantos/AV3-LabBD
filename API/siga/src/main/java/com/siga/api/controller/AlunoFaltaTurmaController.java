package com.siga.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siga.api.domain.service.AlunoFaltaTurmaService;
import com.siga.api.model.entity.AlunoFaltaTurma;

@CrossOrigin
@RestController
@RequestMapping("/faltas")
public class AlunoFaltaTurmaController {

	@Autowired
	private AlunoFaltaTurmaService alunoService;
	
	@GetMapping("/{codigoDisciplina}")
	public List<AlunoFaltaTurma> getListaALunoFalta(@PathVariable String codigoDisciplina){
		return alunoService.getListaAlunoFalta(codigoDisciplina);
	}
}
