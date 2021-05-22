package com.siga.api.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siga.api.model.entity.Curso;
import com.siga.api.model.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, String>{

	public List<Disciplina> findAllByCurso(Curso curso);
	public List<Disciplina> findAllBySigla(String sigla);
}
