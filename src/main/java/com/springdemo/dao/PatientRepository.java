package com.springdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springdemo.model.patient;

public interface PatientRepository extends CrudRepository<patient,Integer> {

}
