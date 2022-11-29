package com.tradicional.carrito;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	
	private List<Producto> carrito = new ArrayList();
	
	
	protected void agregarProducto(Producto producto) {
		carrito.add(producto);
		
	}
	
	
	protected void eliminarProducto(Producto producto) {
		if (carrito.contains(producto)) {
			carrito.remove(producto);
		}
	}
	
	protected void imprimirCarrito () {
		double suma = carrito.stream().mapToDouble(e -> e.getPrecio()).sum();
		
		carrito.stream().forEach(a -> System.out.println(a.getNombre()+"			------- " +  a.getPrecio()));
		System.out.println("-------------------------\nTOTAL:           " + suma);
	}
	
	
	
	

}
