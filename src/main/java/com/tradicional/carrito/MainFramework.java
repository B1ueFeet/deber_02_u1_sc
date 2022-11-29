package com.tradicional.carrito;

public class MainFramework {
	
	public static void main (String [] args) {
		
		CarritoCompras carrito = new CarritoCompras();
		
		Producto a = new Producto();
		a.setNombre("CocaCola");
		a.setPrecio(12.4);
		
		
		Producto b = new Bebida();
		b.setNombre("Nestea");
		b.setPrecio(10.4);
		
		Producto c = new Bebida();
		c.setNombre("CocaCola Ligth");
		c.setPrecio(9.4);
		
		Producto d = new Congelados();
		d.setNombre("Pollo");
		d.setPrecio(20.4);
		
		Producto e = new Congelados();
		e.setNombre("Carne");
		e.setPrecio(10.4);
		
		carrito.agregarProducto(a);
		carrito.agregarProducto(b);
		carrito.agregarProducto(c);
		carrito.agregarProducto(d);
		carrito.agregarProducto(e);
		
		carrito.imprimirCarrito();

		
	}

	
	
	

}
