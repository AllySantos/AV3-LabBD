package com.siga.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siga.api.domain.service.AlunoMediaService;
import com.siga.api.model.entity.AlunoMedia;

@CrossOrigin
@RestController
@RequestMapping("/alunos")
public class AlunoMediaController {

	@Autowired
	private AlunoMediaService alunoMediaService;
	
	@GetMapping("/media/{codigoDisciplina}")
	public List<AlunoMedia> getListaAlunos(@PathVariable String codigoDisciplina){
		
		return alunoMediaService.getListaAlunos(codigoDisciplina);
	}
}
