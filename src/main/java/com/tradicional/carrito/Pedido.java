package com.tradicional.carrito;


public class Pedido extends ProductoCompuesto{

	private String cliente;
	
	public Pedido(String cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
	}

	@Override
	public void addProducto(IPrecio prod) {
		// TODO Auto-generated method stub
		super.addProducto(prod);
	}

	@Override
	public void removeProductos(IPrecio prod) {
		// TODO Auto-generated method stub
		super.removeProductos(prod);
	}
	
	public void estableceCantidad(IPrecio prod, int cantidad) {
		if(prod instanceof ProductoUnitario) {
			ProductoUnitario pu = (ProductoUnitario) prod;
			pu.setCantidad(cantidad);
		}
	}
	
	public void establecePrecio(IPrecio prod, double peso) {
		if(prod instanceof ProductoPeso) {
			ProductoPeso pp = (ProductoPeso) prod;
			pp.setPeso(peso);
		}
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
