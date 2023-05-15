package com.gfd.bookingservice.appointment;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
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
