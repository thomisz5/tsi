package com.utfpr.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String email;
    private String phone;
    private LocalDate dataNascimento;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email, String phone, LocalDate dataNascimento) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dataNascimento = dataNascimento;
    }
    public Person(String name, String email, String phone, String dataNascimento) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.setDataNascimento(dataNascimento);
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        Period period = Period.between(this.dataNascimento, hoje);
        return period.getYears();
    }

}
