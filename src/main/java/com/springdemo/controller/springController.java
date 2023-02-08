package com.springdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.dao.PatientRepository;
import com.springdemo.model.patient;
import com.springdemo.service.patientService;

@RestController
@RequestMapping("/springboot")
public class springController {
	
	@Autowired
	private patientService ps;

	@GetMapping("/msg")
	public String displayMessage() {
		return "Hello from Mano, This is a My Spring boot application.....";
	}
	
	@GetMapping("/allpatient")
	public Iterable<patient> getAllpatient() {
		return ps.getAllpatient();
	}
	
	@GetMapping("/patient/{pid}")
	public Optional<patient> getpatientByPid(@PathVariable Integer pid){
		return ps.getpatientByPid(pid);
	}
	@PostMapping("/addpatient")
	public String addPatient(@RequestBody patient Patient) {
		ps.addPatient(Patient);
		return "Patient Added Successfully";
	}
	
	@DeleteMapping("/deletepatient/{pid}")
	public String deletePatient(@PathVariable Integer pid) {
		ps.deletePatient(pid);
		return "Patient with ID:" + pid + " Deleted succesfully";
	}
	
}
