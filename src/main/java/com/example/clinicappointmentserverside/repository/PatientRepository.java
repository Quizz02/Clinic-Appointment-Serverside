package com.example.clinicappointmentserverside.repository;

import com.example.clinicappointmentserverside.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
//    Patient getPatientByFirstName();
}
