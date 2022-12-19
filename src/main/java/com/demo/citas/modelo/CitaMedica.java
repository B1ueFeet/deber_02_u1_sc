package com.demo.citas.modelo;

import java.time.LocalDateTime;

public class CitaMedica {
	
	private Doctor doctor;
	private Paciente paciente;
	private LocalDateTime Fecha;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public LocalDateTime getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "CitaMedica [doctor=" + doctor + ", paciente=" + paciente + ", Fecha=" + Fecha + "]";
	}
	
	
	
}
