package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Aerolinea")


public class Aerolinea implements Serializable{
	
	@Column(name="nombre_aerolinea")
    private String nombre;
	
    @Id
    @Column(name="id_aerolinea")
    private Integer id_aerolinea;
    
    @Column(name="tipo_vuelos")
    private Tipo_Vuelos tipo_vuelos;
    
    @Column(name="bool_activo")
    private Boolean bool_activo;    
    
	public String getNombre() {
		return nombre;
	}
	public Aerolinea(){
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId_aerolinea() {
		return id_aerolinea;
	}
	public void setId_aerolinea(Integer id_aerolinea) {
		this.id_aerolinea = id_aerolinea;
	}
	public Tipo_Vuelos getTipo_vuelos() {
		return tipo_vuelos;
	}
	public void setTipo_vuelos(Tipo_Vuelos tipo_vuelos) {
		this.tipo_vuelos = tipo_vuelos;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
