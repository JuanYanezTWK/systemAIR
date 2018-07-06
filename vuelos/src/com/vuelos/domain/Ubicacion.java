package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table


public class Ubicacion implements Serializable{
	
	@Id
	@Column(name="id_ubicacion")
    private Integer id_ubicacion;
	
	@Column(name="descripcion")
    private String descripcion;
	
	public Ubicacion() {
		
	}
	public Integer getId_ubicacion() {
		return id_ubicacion;
	}
	public void setId_ubicacion(Integer id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
