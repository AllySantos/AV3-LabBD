package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import com.siga.api.model.entity.id.FaltaId;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Faltas")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

@NamedNativeQuery(name = "Falta.findByDisciplinaAndData",
					query = "select RaAluno, CodigoDisciplina, DataFalta, Presenca from Faltas where CodigoDisciplina = ?1 and DataFalta = ?2",
					resultClass = Falta.class)

@NamedNativeQuery(name = "Falta.findByAluno",
					query = "select * from Faltas where RaAluno = ?1 ",
					resultClass = Falta.class)


public class Falta {


	@EmbeddedId
	private FaltaId id;
	
	

	@Column(name = "Presenca")
	private Integer presenca;

}
