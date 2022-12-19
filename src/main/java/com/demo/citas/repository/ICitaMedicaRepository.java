package com.demo.citas.repository;

import java.util.List;

import com.demo.citas.modelo.CitaMedica;



public interface ICitaMedicaRepository {
	
	public CitaMedica buscar(Integer id);

	public void actualizar(CitaMedica citaMedica);

	public void insertar(CitaMedica citaMedica);

	public void borrar(Integer id);

	public List<CitaMedica> buscarTodo();

}
