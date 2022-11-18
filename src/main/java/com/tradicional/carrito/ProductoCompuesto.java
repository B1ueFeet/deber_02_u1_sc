package com.tradicional.carrito;
import java.util.ArrayList;



public class ProductoCompuesto implements IPrecio{

    private ArrayList<IPrecio> productos;
    
    public ProductoCompuesto() {
		// TODO Auto-generated constructor stub
    	productos = new ArrayList<IPrecio>();
	}
    
    public void addProducto(IPrecio prod) {
    	productos.add(prod);
    }
    
    public void removeProductos(IPrecio prod){
    	productos.remove(prod);
    }
    
    public ArrayList<IPrecio> getProductos(){
    	return productos;
    }
	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		double importeTotal = productos.stream().mapToDouble(a -> a.getImporteTotal()).sum();
		return importeTotal;
	}
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Este es un producto compuesto:");
		imprimirProducto();
		return "";
	}
	public void imprimirProducto () {
		System.out.println("***  PRODUCTOS INCLUIDOS  ***");
		productos.stream().map(a-> a.toString()).forEach(System.out::println);
	}

}
