package com.siga.api.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaltaDTO {

	private int ra;
	private String disciplina;
	private Date dataFalta;
	private int qtdePresenca;
}
