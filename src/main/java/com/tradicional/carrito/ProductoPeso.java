package com.tradicional.carrito;



public class ProductoPeso implements IPrecio{

	private double peso;
    private double precio;
    private String nombre;
    private String categoria;
    
    public ProductoPeso(double peso, double precio, String nombre,  String categoria ) {
		// TODO Auto-generated constructor stub
    	
    	this.peso = peso;
    	this.precio = precio;
    	this.nombre = nombre;
    	this.categoria = categoria;
	}
	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return precio * peso;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Peso : %s , Precio : %s , Nombre : %s , Categoria : %s", peso, precio, nombre, categoria);
	}
	
}
