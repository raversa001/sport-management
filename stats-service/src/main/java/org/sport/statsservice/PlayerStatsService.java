package org.sport.statsservice;

import org.sport.playerservice.Player;
import org.sport.statsservice.PlayerStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerStatsService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PLAYER_SERVICE_URL = "http://localhost:9092"; // URL du service Player

    // Méthode pour récupérer les statistiques de joueur par playerId en appelant le service Player
    public PlayerStats getPlayerStats(Long playerId) {
        // Utilisez RestTemplate pour effectuer un appel GET au service Player
        String url = PLAYER_SERVICE_URL + "/players/" + playerId;
        Player player = restTemplate.getForObject(url, Player.class);

        // À partir des données du joueur récupérées, calculez les statistiques de joueur
        // Implémentez la logique pour calculer les statistiques à partir des données du joueur

        // Exemple de calcul des statistiques (à adapter en fonction de vos besoins)
        int matchesPlayed = player.getMatchesPlayed();
        int goalsScored = player.getGoalsScored();
        int assists = player.getAssists();
        Long teamId = player.getTeamId();

        return new PlayerStats(playerId, player.getName(), teamId, matchesPlayed, goalsScored, assists);
    }

    // Autres méthodes pour le service PlayerStats
}
