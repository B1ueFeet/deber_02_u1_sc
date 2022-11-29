package com.tradicional.componentes.repository;

import com.tradicional.componentes.modelo.Producto;

public interface IProductoRepo {
	public Producto buscarPorNumero(String n);

	
	public Producto buscar(Integer id);
	public void actualizar(Producto producto);
	public void insertar(Producto producto);
	public void borrar(Integer id);

}
