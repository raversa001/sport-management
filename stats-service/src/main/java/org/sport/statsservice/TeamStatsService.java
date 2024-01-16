package org.sport.statsservice;

import org.sport.statsservice.TeamStats;
import org.sport.teamservice.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamStatsService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String TEAM_SERVICE_URL = "http://localhost:9091"; // URL du service Team
    private static final String PLAYER_SERVICE_URL = "http://localhost:9092"; // URL du service Player

    // Méthode pour récupérer les statistiques d'équipe par teamId en appelant le service Team
    public TeamStats getTeamStats(Long teamId) {
        String teamUrl = TEAM_SERVICE_URL + "/teams/" + teamId;
        Team team = restTemplate.getForObject(teamUrl, Team.class);

        int matchesPlayed = team.getMatchesPlayed();
        int matchesWon = team.getMatchesWon();
        int matchesDrawn = team.getMatchesDrawn();
        int matchesLost = team.getMatchesLost();
        int goalsFor = team.getGoalsFor();
        int goalsAgainst = team.getGoalsAgainst();

        TeamStats teamStats = new TeamStats(teamId, matchesPlayed, matchesWon, matchesDrawn, matchesLost, goalsFor, goalsAgainst);

        return teamStats;
    }

    // Autres méthodes pour le service TeamStats
}
