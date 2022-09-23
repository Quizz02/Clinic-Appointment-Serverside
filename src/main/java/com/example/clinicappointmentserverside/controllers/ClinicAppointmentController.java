package com.example.clinicappointmentserverside.controllers;

import com.example.clinicappointmentserverside.models.ClinicAppointment;
import com.example.clinicappointmentserverside.service.ClinicAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"/api/clinicappointments"})
public class ClinicAppointmentController {

    @Autowired
    private ClinicAppointmentService clinicAppointmentService;

    @GetMapping
    public List<ClinicAppointment> getAllAppointments(){
        return clinicAppointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public ClinicAppointment getAppointmentById(@PathVariable Long id){
        return clinicAppointmentService.getById(id);
    }

    @PostMapping
    public ClinicAppointment createAppointment(@RequestBody ClinicAppointment clinicAppointment){
        return clinicAppointmentService.createAppointment(clinicAppointment);
    }

    @PutMapping("/{id}")
    public ClinicAppointment updateAppointment(@RequestBody ClinicAppointment clinicAppointment, @PathVariable Long id){
        clinicAppointment.setAppointmentId(id);
        return clinicAppointmentService.editAppointment(clinicAppointment);
    }

    @DeleteMapping("/{id}")
    public ClinicAppointment deleteAppointment(@PathVariable Long id){
        return clinicAppointmentService.delete(id);
    }
}
