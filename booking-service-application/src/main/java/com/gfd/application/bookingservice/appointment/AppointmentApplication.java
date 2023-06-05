package com.gfd.application.bookingservice.appointment;

import com.gfd.model.bookingservice.appointment.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class AppointmentApplication {
    @Autowired
    public AppointmentApplication() {
    }

    public List<Appointment> getAppointments(){
        return List.of(new Appointment(
                LocalDate.now(),
                1L,
                "Barber",
                "Bob Jones",
                "Main Street",
                20,
                30)
        );
}
}
