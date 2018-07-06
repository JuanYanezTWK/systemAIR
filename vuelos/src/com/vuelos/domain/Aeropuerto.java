package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table
public class Aeropuerto implements Serializable{
	
	@Column(name="nombre_aeropuerto")
    private String nombre;
	
	@Column(name="ciudad_aeropuerto")
    private Ciudades ciudad;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
    
	
	public Aeropuerto() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ciudades getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudades ciudad) {
		this.ciudad = ciudad;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
