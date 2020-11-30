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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + columna;
			result = prime * result + fila;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Posicion other = (Posicion) obj;
			if (columna != other.columna)
				return false;
			if (fila != other.fila)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "fila=" + fila + ", columna=" + columna + "";
		}
		
}
