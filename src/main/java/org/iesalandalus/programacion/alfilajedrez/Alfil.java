package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;
	
	public Alfil(Color color) {
		this.color=color;
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		if (color==Color.BLANCO) {
			posicion=new Posicion(1,'f');
		}if (color==Color.NEGRO) {
			this.posicion=new Posicion(8,'f');
		}
	}
	
	
	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}


