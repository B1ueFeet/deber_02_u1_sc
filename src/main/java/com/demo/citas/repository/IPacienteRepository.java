package com.demo.citas.repository;

import com.demo.citas.modelo.Paciente;

public interface IPacienteRepository {
	
	public Paciente buscar(String cedula);
	public void insertar(Paciente paciente );

}
