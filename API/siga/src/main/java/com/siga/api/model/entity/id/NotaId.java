package com.siga.api.model.entity.id;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.siga.api.model.entity.Aluno;
import com.siga.api.model.entity.Avaliacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotaId implements Serializable{

	private static final long serialVersionUID = 1L;


	@ManyToOne
	@JoinColumn(name = "RaAluno")
	private Aluno aluno;
	

	@ManyToOne
	@JoinColumn(name = "CodigoAvaliacao")
	private Avaliacao avaliacao;
}
