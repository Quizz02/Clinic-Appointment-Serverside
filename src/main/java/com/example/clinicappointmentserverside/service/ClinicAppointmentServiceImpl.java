package com.example.clinicappointmentserverside.service;

import com.example.clinicappointmentserverside.exception.ResourceNotFoundException;
import com.example.clinicappointmentserverside.models.ClinicAppointment;
import com.example.clinicappointmentserverside.repository.ClinicAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicAppointmentServiceImpl implements ClinicAppointmentService {

    @Autowired
    private ClinicAppointmentRepository clinicAppointmentRepository;

    @Override
    public List<ClinicAppointment> getAllAppointments() {
        return clinicAppointmentRepository.findAll();
    }

    @Override
    public ClinicAppointment getById(Long id) {
        return clinicAppointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Appointment", "id", id
                ));
    }

    @Override
    public ClinicAppointment createAppointment(ClinicAppointment appointment) {
        return clinicAppointmentRepository.save(appointment);
    }

    @Override
    public ClinicAppointment editAppointment(ClinicAppointment appointment) {
        return clinicAppointmentRepository.save(appointment);
    }

    @Override
    public ClinicAppointment delete(Long id) {
        ClinicAppointment appointment = clinicAppointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Appointment", "id", id
        ));
        clinicAppointmentRepository.delete(appointment);

        return appointment;
    }
}
