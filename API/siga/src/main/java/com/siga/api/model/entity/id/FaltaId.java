	package com.siga.api.model.entity.id;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

import com.siga.api.model.entity.Aluno;
import com.siga.api.model.entity.Disciplina;
import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString



public class FaltaId implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Nullable
	@ManyToOne
	@JoinColumn(name = "RaAluno")
	private Aluno aluno;
	
	@Nullable
	@ManyToOne
	@JoinColumn(name = "CodigoDisciplina")
	private Disciplina disciplina;
	
	@Nullable

	@Column(name = "DataFalta")
	private Date dataFalta;
	
}
