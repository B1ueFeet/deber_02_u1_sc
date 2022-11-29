package com.tradicional.carrito;

public class Producto {
	
	private String codigo, peso, nombre;
	private double precio;
	
	


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", peso=" + peso + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	//GETTER & SETTER

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
