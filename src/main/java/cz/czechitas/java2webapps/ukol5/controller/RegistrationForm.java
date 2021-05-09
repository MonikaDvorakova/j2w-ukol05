package cz.czechitas.java2webapps.ukol5.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.EnumSet;

public class RegistrationForm {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String birthday;
    @NotNull
    private Gender gender;
    private EnumSet<Sport> sport;
    @NotNull
    private SessionDate sessionDate;
    private String email;
    private String phone;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public EnumSet<Sport> getSport() {
        return sport;
    }

    public void setSport(EnumSet<Sport> sport) {
        this.sport = sport;
    }

    public SessionDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(SessionDate sessionDate) {
        this.sessionDate = sessionDate;
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
}

