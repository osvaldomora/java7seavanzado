package com.mitocode.tema4.generic;

public class Alumno extends Persona {
	
	private int edad;

	public Alumno(String nombre) {
		super(nombre);
	}
	
	public void saludar(){
		System.out.println("Hola, soy un alumno de MitoCode");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



}
