package com.vuelos.domain;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table

public class Vuelos implements Serializable{
	@Id
	@Column(name="id_vuelo")
	private Integer id_vuelo;
	
	@Column(name="origen")
    private Aeropuerto origen;
    
	@Column(name="destino")
	private Aeropuerto destino;
	
	@Column(name="horario")
    private Date horario;
	
	@Column(name="tarifa")
    private Tarifas tarifas;
	
	@Column(name="aerolinea")
    private Aerolinea aerolinea;
	
	@Column(name="avion")
    private Avion avion;
	
	@Column(name="estado")
    private Estado estado_vuelo;
    
	@Column(name="es_itinerario")
    private Boolean es_itinerario;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
	
	public Vuelos() {
		
	}
	
	public Integer getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(Integer id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	
	public Aeropuerto getOrigen() {
		return origen;
	}
	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}
	public Aeropuerto getDestino() {
		return destino;
	}
	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public Tarifas getTarifas() {
		return tarifas;
	}
	public void setTarifas(Tarifas tarifas) {
		this.tarifas = tarifas;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Estado getEstado_vuelo() {
		return estado_vuelo;
	}
	public void setEstado_vuelo(Estado estado_vuelo) {
		this.estado_vuelo = estado_vuelo;
	}
	public Boolean getEs_itinerario() {
		return es_itinerario;
	}
	public void setEs_itinerario(Boolean es_itinerario) {
		this.es_itinerario = es_itinerario;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
