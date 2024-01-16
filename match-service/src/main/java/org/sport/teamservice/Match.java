package org.sport.teamservice;

public class Match {

    private Long id;
    private Long idTeam1;
    private Long idTeam2;
    private String date; // Supposons que la date est une chaîne de caractères au format souhaité
    private String location;
    private Long idWinner;

    // Constructeur, getters et setters pour les attributs...

    // Constructeur par défaut
    public Match() {
    }

    // Constructeur avec des paramètres
    public Match(Long id, Long idTeam1, Long idTeam2, String date, String location, Long idWinner) {
        this.id = id;
        this.idTeam1 = idTeam1;
        this.idTeam2 = idTeam2;
        this.date = date;
        this.location = location;
        this.idWinner = idWinner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTeam1() {
        return idTeam1;
    }

    public void setIdTeam1(Long idTeam1) {
        this.idTeam1 = idTeam1;
    }

    public Long getIdTeam2() {
        return idTeam2;
    }

    public void setIdTeam2(Long idTeam2) {
        this.idTeam2 = idTeam2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getIdWinner() {
        return idWinner;
    }

    public void setIdWinner(Long idWinner) {
        this.idWinner = idWinner;
    }

    // Autres méthodes et opérations associées aux matchs...
}
