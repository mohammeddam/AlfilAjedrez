package org.iesalandalus.programacion.alfilajedrez;

import java.util.Objects;

import javax.naming.OperationNotSupportedException;

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
	public Alfil(Color color,char columna) {
		this.color=color;
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
			if(columna == 'c' || columna == 'f') {	
				if(color == color.BLANCO) {
					this.posicion=new Posicion(1,columna);
				}else {
					this.posicion=new Posicion(8,columna);
				}			
			}else {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			}

	}
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException ("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		}
		switch (direccion) {
			case ARRIBA_IZQUIERDA:
				if(posicion.getFila()+1<=8 && posicion.getColumna()+1<='a') {
					posicion.setFila(posicion.getFila()+pasos);
					posicion.setColumna((char)(posicion.getColumna()-pasos));
				} else {
					throw new OperationNotSupportedException ("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
			case ARRIBA_DERECHA:
				if(posicion.getFila()+1<=8 && posicion.getColumna()+1<='h') {
					posicion.setFila(posicion.getFila()+pasos);
					posicion.setColumna((char)(posicion.getColumna()+pasos));
				} else {
					throw new OperationNotSupportedException ("ERROR: Movimiento no válido (se sale del tablero).");
				}
				
				break;
			case ABAJO_DERECHA:
				if(posicion.getFila()-1>=1 && posicion.getColumna()+1<='h') {
					posicion.setFila(posicion.getFila()-pasos);
					posicion.setColumna((char)(posicion.getColumna()+pasos));
				} else {
					throw new OperationNotSupportedException ("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
			case ABAJO_IZQUIERDA:
				if(posicion.getFila()-1>=1 && posicion.getColumna()-1>='a') {
					posicion.setFila(posicion.getFila()-pasos);
					posicion.setColumna((char)(posicion.getColumna()-pasos));
				} else {
					throw new OperationNotSupportedException ("ERROR: Movimiento no válido (se sale del tablero).");
				}
				break;
				
		}

	}
	@Override
	public int hashCode() {
		return Objects.hash(color, posicion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		return color == other.color && Objects.equals(posicion, other.posicion);
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


