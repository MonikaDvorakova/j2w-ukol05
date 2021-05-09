package cz.czechitas.java2webapps.ukol5.controller;

public enum Gender {
    MALE("muz"),
    FEMALE("zena");

    private String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
