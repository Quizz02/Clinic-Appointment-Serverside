package com.example.clinicappointmentserverside.service;

import com.example.clinicappointmentserverside.models.ClinicAppointment;

import java.util.List;
import java.util.Optional;

public interface ClinicAppointmentService {
    List<ClinicAppointment> getAllAppointments();
    ClinicAppointment getById(Long id);
    ClinicAppointment createAppointment(ClinicAppointment appointment);
    ClinicAppointment editAppointment(ClinicAppointment appointment);
    ClinicAppointment delete(Long id);
}
