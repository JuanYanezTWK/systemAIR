package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Estado implements Serializable{
	
	@Id
	@Column(name="id_estado")
    private Integer id_estado;
	
	@Column(name="descripcion")
    private String descripcion;
	
	public Estado() {
		
	}
	public Integer getId_estado() {
		return id_estado;
	}
	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
