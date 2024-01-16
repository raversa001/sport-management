package org.sport.teamservice;

import org.sport.playerservice.Player;

import java.util.List;

public class Team {
    private Long id;
    private String name;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;
    private int goalsFor;
    private int goalsAgainst;
    private List<Player> players;

    public Team() {
        // Constructeur par défaut
    }

    public Team(Long id, String name, int matchesPlayed, int matchesDrawn, int matchesLost, int matchesWon, int goalsFor, int goalsAgainst) {
        this.id = id;
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
        this.matchesWon = matchesWon;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public List<Player> getPlayers() {
        return this.players;
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

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    // Méthodes pour incrémenter les statistiques
    public void incrementMatchesPlayed() {
        matchesPlayed++;
    }

    public void incrementMatchesWon() {
        matchesWon++;
    }

    public void incrementMatchesDrawn() {
        matchesDrawn++;
    }

    public void incrementMatchesLost() {
        matchesLost++;
    }

    public void incrementGoalsFor() {
        goalsFor++;
    }

    public void incrementGoalsAgainst() {
        goalsAgainst++;
    }

    public void setPlayers(List<Player> lPlayer) {
        this.players = lPlayer;
    }

    // Autres méthodes au besoin
}
