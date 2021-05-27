package com.siga.api.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siga.api.domain.repository.AlunoMediaRepository;
import com.siga.api.model.entity.AlunoMedia;

@Service
public class AlunoMediaService {

	@Autowired
	private AlunoMediaRepository alunoMediaRepository;
	
	
	public List<AlunoMedia> getListaAlunos(String codigoDisciplina){
		
		List<AlunoMedia> listaAlunos = new ArrayList<>();
		
		listaAlunos = alunoMediaRepository.getListaAlunos(codigoDisciplina);
		
		
		//tratamento de valor null
		for(AlunoMedia am : listaAlunos) {
			am.setNota1(converteNull(am.getNota1()));
			am.setNota2(converteNull(am.getNota2()));
			am.setNota3(converteNull(am.getNota3()));
			am.setNota4(converteNull(am.getNota4()));
			am.setExame(converteNull(am.getExame()));
			am.setMedia_final(converteNull(am.getMedia_final()));
			
			if(am.getSituacao() == null) {
				am.setSituacao("---");
			}
		}
		
		return listaAlunos;
	}
	
	private Float converteNull(Float elemento) {
		if(elemento == null) {
			return (float) 0.0;
		}
		
		return elemento;
	}
}
