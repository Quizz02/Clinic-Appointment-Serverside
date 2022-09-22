package com.example.clinicappointmentserverside.controllers;

import com.example.clinicappointmentserverside.models.Patient;
import com.example.clinicappointmentserverside.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient>getAll(){
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        return patientService.getById(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable Long id){
        patient.setPatientId(id);
        return patientService.editPatient(patient);
    }

    @DeleteMapping("/{id}")
    public Patient deletePatient(@PathVariable Long id){
        return patientService.delete(id);
    }

}
