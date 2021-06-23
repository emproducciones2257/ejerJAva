package ejerJava;

import java.util.Scanner;

public class iniciar {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre");
		
		p.setNombre(sc.next());
		
		System.out.println("Ingrese su Apellido");
		
		p.setApellido(sc.next());
		
		System.out.println("Ingrese su Edad");
		
		p.setEdad(sc.nextByte());
		
		System.out.println("Ingrese su Hobbie");
		
		p.setHobbie(sc.next());
		
		System.out.println("Ingrese su Editor de Codigo Favorito");
		
		p.setEditor(sc.next());
		
		System.out.println("Ingrese su Sistema Operativo que utiliza");
		
		p.setSo(sc.next());
		
		System.out.println(p.toString());

	}
}
