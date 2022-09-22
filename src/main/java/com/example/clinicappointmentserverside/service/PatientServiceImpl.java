package com.example.clinicappointmentserverside.service;

import com.example.clinicappointmentserverside.exception.ResourceNotFoundException;
import com.example.clinicappointmentserverside.models.Patient;
import com.example.clinicappointmentserverside.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Patient", "id", id
                ));
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient editPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient delete(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                "Patient", "id", id
        ));
        patientRepository.delete(patient);

        return patient;
    }
}
