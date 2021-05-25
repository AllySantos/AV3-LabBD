package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

@NamedNativeQuery(name = "Disciplina.findDisciplinasByCurso",
					query = "select *  from Disciplina where CodigoCurso = ?1 ",
					resultClass = Disciplina.class)
public class Disciplina {

	@Id
	private String codigo;
	
	@Column
	private String nome;
	
	@Column
	private String sigla;
	
	@Column
	private char turno;
	
	@Column
	private int numAulas;
	
	@ManyToOne(targetEntity = Curso.class)
	@JoinColumn(name = "CodigoCurso")
	private Curso curso;
}
