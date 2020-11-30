package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	public Posicion(int fila,char columna) {
		
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
			}else {
				this.fila=fila;
			}
			if (columna< 'a'|| columna>'h') {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			}else {
				this.columna=columna;}
			}
	Posicion() {
	}

		
			public Posicion(Posicion posicion) {
				if (posicion != null) {
					this.fila=posicion.getFila();
					this.columna=posicion.getColumna();}
				else {
					throw new NullPointerException("ERROR: No es posible copiar una posición nula.");}

				}

	
	public int getFila() {
		return fila;
	}
	 void setFila(int fila) {
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	 void setColumna(char i) {
		this.columna = i;
	}

}
