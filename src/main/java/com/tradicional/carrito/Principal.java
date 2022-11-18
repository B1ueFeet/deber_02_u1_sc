package com.tradicional.carrito;

import java.util.Arrays;
import java.util.List;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedido pedido = new Pedido("AAA");
		ProductoUnitario galleta = new ProductoUnitario(3, 1.30, "Ricas", "Golosinas");
		ProductoUnitario gaseosa = new ProductoUnitario(2, 1.50, "Coca-Cola", "Bebidas");
		ProductoUnitario fideos = new ProductoUnitario(4, 1.80, "Oriental", "Pastas");
		ProductoUnitario atun = new ProductoUnitario(6, 2.20, "Real", "Enlatados");
		ProductoPeso jamon = new ProductoPeso(1.4, 2.30, "Jamon Serrano", "Embutidos");
		ProductoPeso pescado = new ProductoPeso(1.8, 5.00, "Salmon", "Mariscos");
		ProductoPeso papas = new ProductoPeso(2.2, 2.00, "Papa Chola", "Tuberculos");
		ProductoPeso arroz = new ProductoPeso(4.2, 1.60, "Macare�o", "Granos");
		
		ProductoCompuesto canasta = new ProductoCompuesto();
		
		canasta.addProducto(galleta);
		canasta.addProducto(fideos);
		canasta.addProducto(arroz);
		canasta.addProducto(jamon);
		
		pedido.addProducto(gaseosa);
		pedido.addProducto(pescado);
		pedido.addProducto(arroz);
		pedido.addProducto(papas);
		
		
		System.out.println("El costo total es: "+ pedido.getImporteTotal());
		System.out.println("El costo de la canasta es: "+canasta.getImporteTotal());
		
		pedido.addProducto(canasta);
		System.out.println("Costo total: "+pedido.getImporteTotal());
		
		
		pedido.imprimirProducto();
		
		
		
	}

}
