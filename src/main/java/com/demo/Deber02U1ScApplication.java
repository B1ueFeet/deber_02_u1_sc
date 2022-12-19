package com.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.citas.modelo.Doctor;
import com.demo.citas.modelo.Paciente;
import com.demo.citas.service.ICitaMedicaService;
import com.demo.citas.service.IDoctorService;
import com.demo.citas.service.IPacienteService;

@SpringBootApplication
public class Deber02U1ScApplication implements CommandLineRunner {
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Deber02U1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doctor doctor = new Doctor();
		doctor.setApellido("Castillo");
		doctor.setCedula("1717844466");
		doctor.setEspecialidad("Pediatria");
		doctor.setNombre("Serghy");
		
		this.doctorService.agregar(doctor);
		
		Paciente paciente = new Paciente() ;
		paciente.setApellido("Cardenas");
		paciente.setCedula("1717560930");
		paciente.setNombre("Maria");
		
		this.pacienteService.agregar(paciente);
		
		this.citaMedicaService.Agendar("1717844466", "1717560930", LocalDateTime.of(1997, 7, 12, 12, 35));
		
		
		
		
		
		
		
	}

}
