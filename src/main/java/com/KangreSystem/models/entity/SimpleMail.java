package com.KangreSystem.models.entity;

public class SimpleMail {
	
	private String nombre;
	private String correo;
	private String asunto;
	private String mensaje;
	
	public SimpleMail() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "SimpleMail [nombre=" + nombre + ", correo=" + correo + ", asunto=" + asunto + ", mensaje=" + mensaje
				+ "]";
	}
	
}
