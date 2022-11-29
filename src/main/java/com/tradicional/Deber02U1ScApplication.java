package com.tradicional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tradicional.Spring.CarritoComprasSB;
import com.tradicional.Spring.ProductoSB;

@SpringBootApplication
public class Deber02U1ScApplication implements CommandLineRunner {
	
	@Autowired
	CarritoComprasSB carrito ;
	@Autowired
	ProductoSB a;
	@Autowired
	ProductoSB b;
	@Autowired
	ProductoSB c;
	@Autowired
	ProductoSB d;
	@Autowired
	ProductoSB e;
	

	public static void main(String[] args) {
		SpringApplication.run(Deber02U1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		a.setNombre("CocaCola");
		a.setPrecio(12.4);
		
		
		
		b.setNombre("Nestea");
		b.setPrecio(10.4);
		
		
		c.setNombre("CocaCola Ligth");
		c.setPrecio(9.4);
		
		
		d.setNombre("Pollo");
		d.setPrecio(20.4);
		
		
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
