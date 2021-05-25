package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.siga.api.model.entity.id.NotaId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notas {


	@EmbeddedId
	private NotaId id;
	
	@Column
	private Float nota;
	

	
}
