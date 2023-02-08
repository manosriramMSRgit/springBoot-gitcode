package com.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.dao.PatientRepository;
import com.springdemo.model.patient;

@Service
public class patientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public void addPatient(patient Patient)  
	{    
	patientRepository.save(Patient);    
	}   
	
	public void deletePatient(int pid) 
	{
		patientRepository.deleteById(pid);
	}
	
	public Iterable<patient> getAllpatient()
	{
		return patientRepository.findAll();
	}
	
	public Optional<patient> getpatientByPid(int pid){
		return patientRepository.findById(pid);
	}
}
