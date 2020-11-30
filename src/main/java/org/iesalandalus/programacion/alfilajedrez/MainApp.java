package org.iesalandalus.programacion.alfilajedrez;

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
	private static void ejecutarOpcion(int opcion) {
		// TODO Auto-generated method stub
		
	}
	private static int elegirOpcion() {
		// TODO Auto-generated method stub
		return 0;
	}


}
