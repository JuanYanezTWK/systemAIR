package com.vuelos.domain;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table

public class Itinerario implements Serializable{
	
	@Id
	@Column(name="id_itinerario")
    private Integer id_itinerario;
	
	@Column(name="vuelos")
    private Vuelos vuelos;
	
	@Column(name="segmento_vuelos")
    private String segmento_vuelos;
	
	@Column(name="routing")
    private String routing;
	
	public Itinerario() {
		
	}
	public Integer getId_itinerario() {
		return id_itinerario;
	}
	public void setId_itinerario(Integer id_itinerario) {
		this.id_itinerario = id_itinerario;
	}
	public Vuelos getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelos vuelos) {
		this.vuelos = vuelos;
	}
	public String getSegmento_vuelos() {
		return segmento_vuelos;
	}
	public void setSegmento_vuelos(String segmento_vuelos) {
		this.segmento_vuelos = segmento_vuelos;
	}
	public String getRouting() {
		return routing;
	}
	public void setRouting(String routing) {
		this.routing = routing;
	}
}
