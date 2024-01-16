// Team.java
package org.sport.teamservice;

public class Team {
    private Long id;
    private String name;
    private String coach;
    private int foundedYear;
    private String stadium;

    // Constructeurs, getters et setters

    public Team() {
    }

    public Team(Long id, String name, String coach, int foundedYear, String stadium) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.foundedYear = foundedYear;
        this.stadium = stadium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
