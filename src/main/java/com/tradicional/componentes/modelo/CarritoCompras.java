package com.tradicional.componentes.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	
	private List<Producto> carrito = new ArrayList();
	
	
	public void agregarProducto(Producto producto) {
		carrito.add(producto);
		
	}
	
	
	protected void eliminarProducto(Producto producto) {
		if (carrito.contains(producto)) {
			carrito.remove(producto);
		}
	}
	
	public void imprimirCarrito () {
		double suma = carrito.stream().mapToDouble(e -> e.getPrecio()).sum();
		
		carrito.stream().forEach(a -> System.out.println(a.getNombre()+"			------- " +  a.getPrecio()));
		System.out.println("-------------------------\nTOTAL:           " + suma);
	}
	
	
	
	

}
