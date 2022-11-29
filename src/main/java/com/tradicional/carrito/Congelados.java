package com.tradicional.carrito;

public class Congelados extends Producto {
	
	private int grados;
	private String metodo;
	
	
	@Override
	public String toString() {
		return (super.toString() + "Congelados [grados=" + grados + ", metodo=" + metodo + "]");
	}


	public int getGrados() {
		return grados;
	}


	public void setGrados(int grados) {
		this.grados = grados;
	}


	public String getMetodo() {
		return metodo;
	}


	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	
	
	
	

}
