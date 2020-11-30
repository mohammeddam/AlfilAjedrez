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
