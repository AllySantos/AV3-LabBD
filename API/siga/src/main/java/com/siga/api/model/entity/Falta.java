package com.siga.api.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import com.siga.api.model.dto.FaltaDTO;
import com.siga.api.model.entity.id.FaltaId;
import com.sun.istack.Nullable;

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

@NamedNativeQuery(name = "Falta.getDatasFalta",
query = "SELECT RaAluno, CodigoDisciplina, DataFalta, Presenca FROM Faltas where CodigoDisciplina = ?1 "
		+ "and RaAluno = (select top 1 RaAluno from Aluno_Disciplina where CodigoDisciplina = ?1) order by DataFalta",
resultClass = Falta.class )

public class Falta {

	@EmbeddedId
	private FaltaId id;
	
	@Nullable
	@Column(name = "Presenca")
	private Integer presenca;
	
	

}
