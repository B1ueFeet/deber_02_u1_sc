package com.demo.citas.service;

import com.demo.citas.modelo.Paciente;

public interface IPacienteService {
	
	public Paciente buscar(String cedula);
	public void agregar (Paciente paciente);
	

}
