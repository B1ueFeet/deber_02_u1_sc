package com.tradicional.componentes.repository;

import com.tradicional.componentes.modelo.CarritoCompras;

public interface ICarritoComprasRepo {
	
	public CarritoCompras buscarPorNumero(String num);

	public CarritoCompras buscar(Integer id);
	public void actualizar(CarritoCompras carritoCompras);
	public void insertar(CarritoCompras carritoCompras);
	public void borrar(Integer id);

}
