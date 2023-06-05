package com.gfd.model.bookingservice.appointment;



import java.time.LocalDate;


public class Appointment {
    private LocalDate date;
    private Long id;
    private String service;
    private String client;
    private String address;
    private Integer cost;
    private Integer duration;

    public Appointment() {
    }

    public Appointment(LocalDate date, Long id, String service, String client, String address, Integer cost, Integer duration) {
        this.date = date;
        this.id = id;
        this.service = service;
        this.client = client;
        this.address = address;
        this.cost = cost;
        this.duration = duration;
    }

    public Appointment(LocalDate date, String service, String client, String address, Integer cost, Integer duration) {
        this.date = date;
        this.service = service;
        this.client = client;
        this.address = address;
        this.cost = cost;
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", id=" + id +
                ", service='" + service + '\'' +
                ", client='" + client + '\'' +
                ", address='" + address + '\'' +
                ", cost=" + cost +
                ", duration=" + duration +
                '}';
    }
}
