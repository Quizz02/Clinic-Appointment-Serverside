package com.example.clinicappointmentserverside.repository;

import com.example.clinicappointmentserverside.models.ClinicAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClinicAppointmentRepository extends JpaRepository<ClinicAppointment, Long> {
//    List<ClinicAppointment>getAllByPatient();
}
