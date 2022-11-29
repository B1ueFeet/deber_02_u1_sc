package com.tradicional.carrito;

public class Bebida extends Producto{
	
	private double volumen;

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return super.toString() + "Bebidas [volumen=" + volumen + "]";
	}
	
	
	

}
