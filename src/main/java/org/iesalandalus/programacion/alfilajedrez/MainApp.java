package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;


	public class MainApp {
		static Alfil alfil= new Alfil();

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
			System.out.println("1. Crear un alfil por defecto .");
			System.out.println("2. Crear un alfil de un color. ");
			System.out.println("3. Crear un alfil de un color en una columna inicial valida.");
			System.out.println("4. Mover el alfil.");
		}
		
		private static int elegirOpcion() {
			System.out.println("Selecciona una opcion:");
			int opcion=Entrada.entero();
			while (opcion<1 || opcion>4) {
				System.out.println("opcion no valida");
				opcion=Entrada.entero();
			}
			return opcion;		
		}
		
		private static void ejecutarOpcion(int opcion) {
			switch (opcion){
			case 1:
				crearAlfilDefecto();
				break;
			case 2:
				crearAlfilColor();
				break;
			case 3:
				crearAlfilColorColumna();
				break;		
			case 4:
				System.out.println(alfil.toString());
				mover();
				break;
			
			}
		}
		
		private static void crearAlfilDefecto() {
			alfil=new Alfil();
			System.out.println(alfil.toString());
		}
		
		private static void crearAlfilColor() {
			Color color=elegirColor();
			alfil=new Alfil(color);
			System.out.println(alfil.toString());
		}
		
		private static Color elegirColor() {
			
			System.out.print("Escribe 1 para alfil blanco  y 2 para que el alfil Negro: ");
			int opcion=Entrada.entero();
			while (opcion!=1 && opcion!=2) {
				System.out.print(" opcion no valida");
				opcion=Entrada.entero();
			}
			return opcion==1?Color.BLANCO:Color.NEGRO;
		}
		
		private static char crearAlfilColorColumna() {
			Color color=elegirColor();
			char columna=elegirColumnaInicial();
			try {
				alfil=new Alfil (color, columna);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(alfil.toString());
			return columna;
			
		}
		
		private static char elegirColumnaInicial() {
			System.out.print("Seleccione una columna inicial. ");
			char columna=Entrada.caracter();
			return columna;
		}
		
		private static void mover() {
			mostrarMenuDirecciones();
			try {
				int pasos;
				alfil.mover(elegirDireccion(), pasos=Entrada.entero());
				System.out.println(alfil.toString());
			} catch (OperationNotSupportedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		private static void mostrarMenuDirecciones() {
			System.out.println("1. ARRIBA IZQUIERDA.");
			System.out.println("2. ARRIBA DERECHA.");
			System.out.println("3. ABAJO DERECHA.");
			System.out.println("4. ABAJO IZQUIERDA.");
		}
		
		private static Direccion elegirDireccion() {
			Direccion direccion=Direccion.ARRIBA_IZQUIERDA;
			int opcion=Entrada.entero();
			while (opcion<1 || opcion>4) {
				System.out.println("opcion no valida:");
				opcion=Entrada.entero();
			}
			System.out.println("introduce  numero de pasos:");
			switch (opcion) {
				case 1:
					direccion=Direccion.ARRIBA_IZQUIERDA;
					break;
				case 2:
					direccion=Direccion.ARRIBA_DERECHA;
					break;
				case 3:
					direccion=Direccion.ABAJO_DERECHA;
					break;
				case 4:
					direccion=Direccion.ABAJO_IZQUIERDA;
					break;

			}

			return direccion;



		}
		
	}

