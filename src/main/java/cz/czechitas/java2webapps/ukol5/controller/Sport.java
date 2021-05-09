package cz.czechitas.java2webapps.ukol5.controller;

public enum Sport {
    BASKETBAL("basketbal"),
    FOTBAL("fotbal"),
    TANEC("tanec"),
    PLAVANI("plavani"),
    CYKLISTIKA("cyklistika");

    private String sportName;

    Sport(String sportName) {
        this.sportName = sportName;
    }

    public String getSportName() {
        return sportName;
    }
}
