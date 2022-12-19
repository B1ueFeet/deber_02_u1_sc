package com.demo.citas.service;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.citas.modelo.CitaMedica;
import com.demo.citas.modelo.Doctor;
import com.demo.citas.modelo.Paciente;
import com.demo.citas.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServideImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Override
	public void Agendar(String cedulaDoctor, String cedulaPaciente, LocalDateTime fechaCita) {
		Random random = new Random();
		Doctor doctor = this.doctorService.buscar(cedulaDoctor);
		Paciente paciente = this.pacienteService.buscar(cedulaPaciente);
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		citaMedica.setId(random.nextInt(100));
		citaMedica.setFecha(fechaCita);
		this.citaMedicaRepository.insertar(citaMedica);
		System.out.println("**********************************\n   La cita fue creada exitosamente");
		System.out.print(citaMedica.toString());
		
	}
	
	

}
