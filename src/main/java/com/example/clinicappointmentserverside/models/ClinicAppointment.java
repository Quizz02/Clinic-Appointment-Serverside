package com.example.clinicappointmentserverside.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "clinic_appointments")
public class ClinicAppointment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @Column(name = "patient")
    private String patient;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "description")
    private String description;

    @Column(name = "appointment_date")
    private Date appointmentDate;
}
