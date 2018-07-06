package com.vuelos.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table

public class Ciudades implements Serializable{
	@Id
	@Column(name="id_ciudad")
    private Integer id_ciudad;
	
	@Column(name="nombre_ciudad")
    private String nombre;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
	
	public Ciudades() {
		
	}
	
	public Integer getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
