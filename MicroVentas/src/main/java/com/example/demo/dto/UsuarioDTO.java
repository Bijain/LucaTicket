package com.example.demo.dto;

import java.time.LocalDateTime;

public class UsuarioDTO {

	private int id;
	private String nombre;
	private String apellido;
	private String mail;
	private String password;
	private LocalDateTime fechaAlta;
	
	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(int id, String nombre, String apellido, String mail, String password, LocalDateTime fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.password = password;
		this.fechaAlta = fechaAlta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail
				+ ", password=" + password + ", fechaAlta=" + fechaAlta + "]";
	}
}
