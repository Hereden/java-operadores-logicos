package operadoresLogicps;

import java.util.Scanner;

public class operdores {

	public static void main(String[] args) {
		/*
		 * Operadores Logicos
		 * a==b a es igual a b
		 * a>b a es mayor a b
		 * a<b a es menor a b
		 * a!=b a es diferente a b
		 */
		int a=30;
		int b=34;
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(saludo());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		System.out.println(saludo2(scanner.nextLine()));

	}
	
	public static String saludo2(String nombre) {
		return "Hola, "+nombre+ " bienvenido";
	}
	
	public static String saludo() {
		String nombre="";
		try {
        	System.out.println("Tu nombre es:");
		    Scanner scanner = new Scanner(System.in);
		    nombre = scanner.nextLine();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "Tu nombre es: " + nombre;
	}
	

}
