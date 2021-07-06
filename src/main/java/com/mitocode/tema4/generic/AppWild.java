package com.mitocode.tema4.generic;

import java.util.ArrayList;
import java.util.List;

public class AppWild {
 //puede recibir cualquier objeto que herede o implemente de persona pero lista solamente se le vana poder añadir Personas.
	public void listarUpperBounded(List<? extends Persona> lista) {
		
		for (Persona per : lista) {		
			//if(a instanceof Alumno){
			System.out.println(per.getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	
	//puede aceptar una lista de Alumno o una lista de la clase que herede Alumno, pero lista solo acepta Alumno almenos que se le haga un cast
	public void listarLowerBounded(List<? super Alumno> lista) {
		lista.add(new Alumno("ddd"));
		for (Object al : lista) {		
			//if(a instanceof Alumno){
			System.out.println(((Persona)al).getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	          //lista va a poder contener cualquier tipo de objeto
	public void listarUnBounded(List<?> lista) {
		
		for (Object al : lista) {		
			//if(a instanceof Alumno){
			System.out.println(((Persona)al).getNombre());
			//}else if(a instanceof Profesor){
			//}
		}
	}
	
	public static void main(String[] args) {
		AppWild aw = new AppWild();
		
//		Persona al1 = new Profesor("MITOCODE");
//		Persona al2 = new Profesor("JAIME");
//		Persona al3 = new Profesor("MITO");
//		
//		List<Persona> lista = new ArrayList<>();
//		lista.add(al1);
//		lista.add(al2);
//		lista.add(al3);
		
		Alumno al1 = new Alumno("MITOCODE");
		Alumno al2 = new Alumno("JAIME");
		Alumno al3 = new Alumno("MITO");
		
		List<Alumno> lista = new ArrayList<>();
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);
		
		aw.listarUpperBounded(lista);
		System.out.println();
		aw.listarLowerBounded(lista);
		System.out.println();
		aw.listarUnBounded(lista);
	}
}
