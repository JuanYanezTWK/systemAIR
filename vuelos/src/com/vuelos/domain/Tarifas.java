package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Tarifas implements Serializable{
	
	@Column(name="ciudad_origen")
    private Ciudades ciudad_origen;
	
	@Column(name="ciudad_destino")
    private Ciudades ciudad_destino;
	
	@Column(name="valor_directo")
    private Integer valor_directo;
	
	@Column(name="valor_itinerario")
    private Integer valor_itinerario;
	
	public Tarifas() {
		
	}
	
	public Ciudades getCiudad_origen() {
		return ciudad_origen;
	}
	public void setCiudad_origen(Ciudades ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}
	public Ciudades getCiudad_destino() {
		return ciudad_destino;
	}
	public void setCiudad_destino(Ciudades ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}
	public Integer getValor_directo() {
		return valor_directo;
	}
	public void setValor_directo(Integer valor_directo) {
		this.valor_directo = valor_directo;
	}
	public Integer getValor_itinerario() {
		return valor_itinerario;
	}
	public void setValor_itinerario(Integer valor_itinerario) {
		this.valor_itinerario = valor_itinerario;
	}
}
