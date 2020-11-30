package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) {
		int opcion=0;
		
		do {
			mostrarMenu();
			opcion=elegirOpcion();
			ejecutarOpcion(opcion);
		} while (opcion!=0);

	}
	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Crear alfil por defecto .");
		System.out.println("2. Crear alfil de un color. ");
		System.out.println("3. Crear alfil de un color en una columna inicial válida.");
		System.out.println("4. Mover el alfil.");
	}
	private static int elegirOpcion() {
		System.out.println("Selecciona una opción:");
		int opcion=Entrada.entero();
		while (opcion<1 || opcion>4) {
			System.out.println("Opción inválida. Seleccione una opción (1-4):");
			opcion=Entrada.entero();
		}
		return opcion;		
	}
	private static void ejecutarOpcion(int opcion) {
		// TODO Auto-generated method stub
		
	}

	

}
