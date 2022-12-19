package com.demo.citas.service;

import com.demo.citas.modelo.Doctor;

public interface IDoctorService {
	
	public Doctor buscar(String cedula);
	public void agregar(Doctor doctor);

}
