package com.siga.api.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siga.api.domain.repository.AlunoFaltaTurmaRepository;
import com.siga.api.model.entity.AlunoFaltaTurma;

@Service
public class AlunoFaltaTurmaService {

	@Autowired
	private AlunoFaltaTurmaRepository alunoFaltaTurmaRepository;
	
	public List<AlunoFaltaTurma> getListaAlunoFalta(String codigoDisciplina){
		
		List<AlunoFaltaTurma> lista = alunoFaltaTurmaRepository.getListaAlunoFaltaTurma(codigoDisciplina);
		
		for(AlunoFaltaTurma aft : lista){
			aft.setSemana1(isNull(aft.getSemana1()));
			aft.setSemana2(isNull(aft.getSemana2()));
			aft.setSemana3(isNull(aft.getSemana3()));
			aft.setSemana4(isNull(aft.getSemana4()));
			aft.setSemana5(isNull(aft.getSemana5()));
			aft.setSemana6(isNull(aft.getSemana6()));
			aft.setSemana7(isNull(aft.getSemana7()));
			aft.setSemana8(isNull(aft.getSemana8()));
			aft.setSemana9(isNull(aft.getSemana9()));
			aft.setSemana10(isNull(aft.getSemana10()));
			aft.setSemana11(isNull(aft.getSemana11()));
			aft.setSemana12(isNull(aft.getSemana12()));
			aft.setSemana13(isNull(aft.getSemana13()));
			aft.setSemana14(isNull(aft.getSemana14()));
			aft.setSemana15(isNull(aft.getSemana15()));
			aft.setSemana16(isNull(aft.getSemana16()));
			aft.setSemana17(isNull(aft.getSemana17()));
			aft.setSemana18(isNull(aft.getSemana18()));
			aft.setSemana19(isNull(aft.getSemana19()));
			aft.setSemana20(isNull(aft.getSemana20()));
			
			aft.setTotalFaltas(isNull(aft.getTotalFaltas()));
			
		}
		
		return lista;
	}
	
	private String isNull(String valor) {
		if(valor == null) {
			return "----";
		}
		
		return valor;
	}
	
}
