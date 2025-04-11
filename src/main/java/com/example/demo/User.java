package com.example.demo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;  
    
    private String username;
    private String password;
    private String city;
    private String age;
    private String email;
    private String name;
    private String surname;

    @ManyToMany // A user can have many favorites
    @JoinTable(
      name = "user_event", 
      joinColumns = @JoinColumn(name = "user_id"), 
      inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> favevents = new ArrayList<>();

    public User() {
        
    }

    public User(String username, String password, String city, String age, String email, String name, String surname) {
        this.username = username;
        this.password = password;
        this.city = city;
        this.age = age;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.favevents = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Event> getFavevents() {
        return favevents;
    }

    public void setFavevents(List<Event> favevents) {
        this.favevents = favevents;
    }
}
