package org.sport.playerservice;

public class Player {
    private Long id;
    private Long teamId;
    private String name;
    private int matchesPlayed;
    private int goalsScored;
    private int assists;

    public Player() {
        // Constructeur par défaut
    }

    public Player(Long id, String name, Long teamId, int matchesPlayed, int goalsScored, int assists) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
        this.matchesPlayed = matchesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    public Long getId() {
        return id;
    }

    public Long getTeamId() {
        return teamId;
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

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    // Méthodes pour incrémenter les statistiques
    public void incrementMatchesPlayed() {
        matchesPlayed++;
    }

    public void incrementGoalsScored() {
        goalsScored++;
    }

    public void incrementAssists() {
        assists++;
    }

    // Autres méthodes au besoin
}
