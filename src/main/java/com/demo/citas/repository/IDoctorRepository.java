package com.demo.citas.repository;

import com.demo.citas.modelo.Doctor;

public interface IDoctorRepository {
	
	public Doctor buscar(String cedula);
	public void insertar(Doctor doctor );
	

}
