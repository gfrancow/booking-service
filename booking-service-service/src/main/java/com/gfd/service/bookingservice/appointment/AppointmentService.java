package com.gfd.service.bookingservice.appointment;

import com.gfd.application.bookingservice.appointment.AppointmentApplication;
import com.gfd.model.bookingservice.appointment.Appointment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentService {

    private AppointmentApplication appointmentApplication;
    public AppointmentService(AppointmentApplication appointmentApplication) {
        this.appointmentApplication = appointmentApplication;
    }

    public List<Appointment> getAppointments(){
        return appointmentApplication.getAppointments();

    }
}
