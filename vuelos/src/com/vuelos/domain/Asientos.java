package com.vuelos.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Asientos implements Serializable{
	@Column(name="avion")
    private Avion avion;
	
	@Id
	@Column(name="numero_asiento")
    private Integer numero_asiento;
	
	@Column(name="clase_asiento")
    private Tipo_Clase clase_asiento;
	
	@Column(name="estado_asiento")
    private Estado_Asiento estado;
	
	@Column(name="ubicacion")
    private Ubicacion ubicacion;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
	
	public Asientos() {
		
	}
	
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Integer getNumero_asiento() {
		return numero_asiento;
	}
	public void setNumero_asientos(Integer numero_asiento) {
		this.numero_asiento = numero_asiento;
	}
	public Tipo_Clase getClase_asiento() {
		return clase_asiento;
	}
	public void setClase_asiento(Tipo_Clase clase_asiento) {
		this.clase_asiento = clase_asiento;
	}
	public Estado_Asiento getEstado() {
		return estado;
	}
	public void setEstado(Estado_Asiento estado) {
		this.estado = estado;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
