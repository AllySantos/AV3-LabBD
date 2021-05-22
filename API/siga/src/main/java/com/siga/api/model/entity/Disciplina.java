package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
