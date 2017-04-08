package com.luis.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuarios_app")
	@Column(name="idUser")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="app")
	private String app;
	@Column(name="apm")
	private String apm;
	@Column(name="edad")
	private Integer edad;
	
	public Usuarios() {
		
	}

	public Usuarios(Integer id, String nombre, String app, String apm, Integer edad) {
		
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.edad = edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", edad=" + edad + "]";
	}
	
	
	
	
}
