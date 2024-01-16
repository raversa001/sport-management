package org.sport.statsservice;

public class TeamStats {
    private Long teamId;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;
    private int goalsFor;
    private int goalsAgainst;

    public TeamStats() {
        // Constructeur par défaut
    }

    public TeamStats(Long teamId, int matchesPlayed, int matchesWon, int matchesDrawn, int matchesLost, int goalsFor, int goalsAgainst) {
        this.teamId = teamId;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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

    // Méthodes complémentaires (peuvent être ajoutées au besoin)

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

    // Autres méthodes complémentaires au besoin
}
