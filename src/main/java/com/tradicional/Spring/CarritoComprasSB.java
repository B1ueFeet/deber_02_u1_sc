package com.tradicional.Spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarritoComprasSB {
	
	private List<ProductoSB> carrito = new ArrayList();
	
	
	public void agregarProducto(ProductoSB producto) {
		carrito.add(producto);
		
	}
	
	
	protected void eliminarProducto(ProductoSB producto) {
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
