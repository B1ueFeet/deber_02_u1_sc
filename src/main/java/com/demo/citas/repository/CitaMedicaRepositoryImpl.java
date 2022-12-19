package com.demo.citas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.citas.modelo.CitaMedica;
import com.demo.citas.modelo.Paciente;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	private static List<CitaMedica> base = new ArrayList<>();
	
	@Override
	public CitaMedica buscar(Integer id) {
		CitaMedica citaMedica = null;
		for (CitaMedica cm : base) {
			if (id.equals(cm.getId())) {
				citaMedica = cm;
			}
			
		}
		return citaMedica;
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		CitaMedica citaMedicaActual = null;
		for (CitaMedica cm : base) {
			if (citaMedica.getId() == cm.getId()) {
				citaMedicaActual = cm;
			}
			
			base.remove(citaMedicaActual);
			base.add(citaMedica);
			
		}
		
	}

	@Override
	public void insertar(CitaMedica citaMedica) {
		base.add(citaMedica);
		
	}

	@Override
	public void borrar(Integer id) {
		CitaMedica citaMedica = null;
		for (CitaMedica cm : base) {
			if (id.equals(cm.getId())) {
				citaMedica = cm;
			}
		}
			
			base.remove(citaMedica);
		
	}

	@Override
	public List<CitaMedica> buscarTodo() {
		// TODO Auto-generated method stub
		return base;
	}
	
	

}
