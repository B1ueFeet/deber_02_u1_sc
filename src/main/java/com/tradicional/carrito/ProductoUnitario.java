package com.tradicional.carrito;



public class ProductoUnitario implements IPrecio{

	private int cantidad;
    private double precio;
    private String nombre;
    private String categoria;
    
     public ProductoUnitario(int cantidad, double precio, String nombre, String categoria) {
		// TODO Auto-generated constructor stub
    	 this.cantidad = cantidad;
    	 this.precio = precio;
    	 this.nombre = nombre;
    	 this.categoria = categoria;
	}
	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return cantidad * precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
		return String.format("Cantidad : %d , Precio : %s , Nombre : %s , Categoria : %s", cantidad, precio, nombre, categoria);
	}

	
}
