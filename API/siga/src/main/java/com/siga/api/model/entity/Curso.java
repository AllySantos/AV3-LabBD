package com.siga.api.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Curso")
@Getter
@Setter
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column
	private String nome;
}
