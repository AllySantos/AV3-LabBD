package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

@NamedNativeQuery(name = "AlunoMedia.getListaAlunos",
					query = "select ra_aluno, nome_aluno, nota1, nota2, nota3, nota4, "
							+ "exame, media_final, situacao from fn_get_alunos_media(?1)",
					resultClass = AlunoMedia.class)
public class AlunoMedia {

	
	@Id

	private int ra_aluno;
	

	private String nome_aluno;
	
	@Column
	private Float nota1;
	
	@Column
	private Float nota2;
	
	@Column
	private Float nota3;
	
	@Column
	private Float nota4;
	
	@Column
	private Float exame;
	
	@Column
	private Float media_final;
	
	@Column
	private String situacao;
}
