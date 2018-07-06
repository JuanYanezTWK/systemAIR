package com.vuelos.domain;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Tipo_Vuelos implements Serializable{
	
	@Id
	@Column(name="id_tipo")
    private Integer id_tipo;
	
	@Column(name="descripcion")
    private String descripcion;
	
	public Tipo_Vuelos() {
		
	}
	public Integer getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
