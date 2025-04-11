package com.example.demo;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "EVENTS")  
public class Event {

    @Id  //  eventID is the Primary Key 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int eventID;

    @Column(nullable = false)  
    private String name;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime time;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String category;

    @Column(length = 500)  
    private String description;

    // constructor (Ffor the JPA)
    public Event() {}

    // Constructor to create an event without the ID
    public Event(String name, LocalDate date, LocalTime time, String city, String place, double price, String category, String description) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.city = city;
        this.place = place;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    // Constructor with ID for the update
    public Event(int eventID, String name, LocalDate date, LocalTime time, String city, String place, double price, String category, String description) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.time = time;
        this.city = city;
        this.place = place;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    // Getters & Setters
    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
