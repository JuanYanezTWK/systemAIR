package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Avion implements Serializable{
	
	@Id
	@Column(name="id_avion")
	private Integer id_avion;

	@Column(name="aerolinea")
    private Aerolinea aerolinea;
	
	@Column(name="modelo")
    private String modelo;
	
	@Column(name="capacidad_carga")
    private Integer capacidad_carga;
	
	@Column(name="asientos")
    private Asientos asientos;
	
	public Avion() {
		
	}
	
	public Integer getId_avion() {
		return id_avion;
	}
	public void setId_avion(Integer id_avion) {
		this.id_avion = id_avion;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getCapacidad_carga() {
		return capacidad_carga;
	}
	public void setCapacidad_carga(Integer capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}
	public Asientos getAsientos() {
		return asientos;
	}
	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}
}
