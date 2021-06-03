package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AlunoFaltaTurma")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@NamedNativeQuery(name = "AlunoFaltaTurma.getListaAlunoFaltaTurma",
					query = "select * from fn_get_all_faltas(?1)",
					resultClass = AlunoFaltaTurma.class)


public class AlunoFaltaTurma {
	
	@Id
	@Column(name = "ra_aluno")
	private int ra;

	@Column(name = "nome_aluno")
	private String nomeAluno;
	
	@Column
	private String semana1;
	
	@Column
	private String semana2;
	
	@Column
	private String semana3;
	
	@Column
	private String semana4;
	
	@Column
	private String semana5;
	
	@Column
	private String semana6;
	
	@Column
	private String semana7;
	
	@Column
	private String semana8;
	
	@Column
	private String semana9;
	
	@Column
	private String semana10;
	
	@Column
	private String semana11;
	
	@Column
	private String semana12;
	
	@Column
	private String semana13;
	
	@Column
	private String semana14;
	
	@Column
	private String semana15;
	
	@Column
	private String semana16;
	
	@Column
	private String semana17;
	
	@Column
	private String semana18;
	
	@Column
	private String semana19;
	
	@Column
	private String semana20;
	
	@Column(name = "total_faltas")
	private String totalFaltas;
}
