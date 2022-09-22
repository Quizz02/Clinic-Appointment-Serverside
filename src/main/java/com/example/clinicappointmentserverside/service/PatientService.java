package com.example.clinicappointmentserverside.service;

import com.example.clinicappointmentserverside.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getById(Long id);
    Patient createPatient(Patient patient);
    Patient editPatient(Patient patient);
    Patient delete(Long id);
}
