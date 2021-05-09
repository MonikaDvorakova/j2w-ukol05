package cz.czechitas.java2webapps.ukol5.controller;

public enum SessionDate {
    FIRST_SESSION("5.-11.7.2021"),
    SECOND_SESSION("12.-18.7.2021"),
    THIRD_SESSION("19-25.7.2021");

    private String sessionDate;

    SessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getSessionDate() {
        return sessionDate;
    }
}
