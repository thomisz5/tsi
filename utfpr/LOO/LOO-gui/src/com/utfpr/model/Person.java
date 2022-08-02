package com.utfpr.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String email;
    private String phone;
    private LocalDate date;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email, String phone, LocalDate date) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }
    public Person(String name, String email, String phone, String date) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.setDate(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        Period period = Period.between(this.date, hoje);
        return period.getYears();
    }

}
