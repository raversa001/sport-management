package org.sport.statsservice;

public class PlayerStats {
    private Long playerId;
    private Long teamId;
    private int matchesPlayed;
    private int goalsScored;
    private int assists;
    private String playerName;


    public PlayerStats() {
        // Constructeur par défaut
    }

    public PlayerStats(Long playerId, String playerName, Long teamId, int matchesPlayed, int goalsScored, int assists) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamId = teamId;
        this.matchesPlayed = matchesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public Long getTeamId() { return teamId; }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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

    // Méthodes complémentaires (peuvent être ajoutées au besoin)

    public void incrementMatchesPlayed() {
        matchesPlayed++;
    }

    public void incrementGoalsScored() {
        goalsScored++;
    }

    public void incrementAssists() {
        assists++;
    }

    // Autres méthodes complémentaires au besoin
}
