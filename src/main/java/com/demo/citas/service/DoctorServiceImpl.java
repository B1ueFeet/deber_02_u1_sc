package com.demo.citas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.citas.modelo.Doctor;
import com.demo.citas.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository doctorRepository;

	@Override
	public Doctor buscar(String cedula) {

		return this.doctorRepository.buscar(cedula);
	}

	@Override
	public void agregar(Doctor doctor) {
		this.doctorRepository.insertar(doctor);
		System.out.println("El doctor fue agegado exitosamente");
		System.out.println(doctor.toString());
	}

}
