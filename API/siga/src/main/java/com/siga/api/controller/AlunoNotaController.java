package com.siga.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siga.api.domain.repository.AlunoNotaRepository;
import com.siga.api.domain.service.AlunoNotaService;
import com.siga.api.model.entity.AlunoNota;

@CrossOrigin
@RestController
@RequestMapping("/alunos")
public class AlunoNotaController {

	@Autowired
	private AlunoNotaService alunoNotaService;
	
	@GetMapping("/nota/{codigoAvaliacao}")
	public List<AlunoNota> getNotaAlunosByDisciplina(@PathVariable int codigoAvaliacao){
		return alunoNotaService.getAlunoNota(codigoAvaliacao);
	}
	
	@PutMapping("/nota/{codigoAvaliacao}")
	public ResponseEntity<AlunoNota> cadastraAlunoNota(@RequestBody List<AlunoNota> lista, @PathVariable int codigoAvaliacao) {
		System.out.println(codigoAvaliacao);
		for(AlunoNota an : lista) {
			alunoNotaService.atualizaNotaAluno(an, codigoAvaliacao);
		}
		return ResponseEntity.ok().build();
		
	}
}
