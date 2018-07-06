package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Estado_Asiento implements Serializable{
	
	@Id
	@Column(name="id_estado")
    private Integer id_estado_asiento;
	
	@Column(name="descripcion")
    private String descripcion;
	
	public Estado_Asiento() {
		
		
	}
	public Integer getId_estado_asiento() {
		return id_estado_asiento;
	}
	public void setId_estado_asiento(Integer id_estado_asiento) {
		this.id_estado_asiento = id_estado_asiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
