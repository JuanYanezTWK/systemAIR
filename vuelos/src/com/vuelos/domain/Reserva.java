package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Reserva implements Serializable{
	
	@Id
	@Column(name="numero_boleto")
    private Integer numero_boleto;
	
	@Id
	@Column(name="vuelo")
    private Vuelos vuelo;
	
	@Id
	@Column(name="asiento")
    private Asientos asiento;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
	
	public Reserva() {
		
	}
	
	public Integer getNumero_boleto() {
		return numero_boleto;
	}
	public void setNumero_boleto(Integer numero_boleto) {
		this.numero_boleto = numero_boleto;
	}
	public Vuelos getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}
	public Asientos getAsiento() {
		return asiento;
	}
	public void setAsiento(Asientos asiento) {
		this.asiento = asiento;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
