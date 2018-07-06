package com.vuelos.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class Clientes implements Serializable{
	
	@Column(name="correo_electronico")
    private String correo_electronico;
	
	@Column(name="password")
    private String password;
	
	@Column(name="numero_tarjeta")
    private Integer numero_tarjeta;
	
	@Column(name="tipo_vuelos")
    private Date fecha_expiracion;
	
	@Id
	@Column(name="rut_cliente")
	private String rut;
	
	@Column(name="nombre_cliente")
    private String nombre;

	@Column(name="fecha_nacimiento")
    private Date fecha_nacimiento;
	
	@Column(name="fecha_registro")
    private Date fecha_registro;
	
	@Column(name="cliente_frecuete")
    private Boolean cliente_frecuete;
	
	@Column(name="bool_activo")
    private Boolean bool_activo;
    
    public Clientes() {
    	
    }
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(Integer numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	public Date getFecha_expiracion() {
		return fecha_expiracion;
	}
	public void setFecha_expiracion(Date fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Boolean getCliente_frecuete() {
		return cliente_frecuete;
	}
	public void setCliente_frecuete(Boolean cliente_frecuete) {
		this.cliente_frecuete = cliente_frecuete;
	}
	public Boolean getBool_activo() {
		return bool_activo;
	}
	public void setBool_activo(Boolean bool_activo) {
		this.bool_activo = bool_activo;
	}
}
