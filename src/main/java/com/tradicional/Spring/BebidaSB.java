package com.tradicional.Spring;

import org.springframework.stereotype.Component;


public class BebidaSB extends ProductoSB{
	
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
