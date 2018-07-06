package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Tipo_Clase implements Serializable{
	
	@Id
	@Column(name="id_clase")
    private Integer id_clase;
	
	@Column(name="descripcion")
    private String descripcion;
	
	public Tipo_Clase() {
		
	}
	public Integer getId_clase() {
		return id_clase;
	}
	public void setId_clase(Integer id_clase) {
		this.id_clase = id_clase;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
