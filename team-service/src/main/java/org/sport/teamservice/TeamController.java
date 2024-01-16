package org.sport.teamservice;

import org.sport.playerservice.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teams")
public class TeamController {
    public List<Team> teams = new ArrayList<>();

    private static final String PLAYER_SERVICE_URL = "http://localhost:9092"; // URL du service Player

    public TeamController() {
        // Initialisation avec deux équipes de données lambda
        teams.add(new Team(1L, "Équipe A", 3, 0, 1, 2, 4, 1));
        teams.add(new Team(2L, "Équipe B", 3, 0, 2, 1, 1, 4));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> getTeamDetails(@PathVariable Long id) {
        // Recherchez l'équipe avec l'ID correspondant à {id} dans votre liste d'équipes
        Team team = teams.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (team != null) {
            // Utilisez RestTemplate pour effectuer un appel GET au service Player pour récupérer la liste de tous les joueurs
            String playersUrl = PLAYER_SERVICE_URL + "/players/all";
            RestTemplate restTemplate = new RestTemplate();
            Player[] allPlayersArray = restTemplate.getForObject(playersUrl, Player[].class);

            // Convertissez le tableau de joueurs en une liste
            List<Player> allPlayers = Arrays.asList(allPlayersArray);

            // Filtrer les joueurs ayant le même teamId que l'équipe trouvée
            List<Player> teamMembers = allPlayers.stream()
                    .filter(player -> player.getTeamId().equals(id))
                    .collect(Collectors.toList());

            // Ajouter la liste des joueurs membres de l'équipe aux détails de l'équipe
            team.setPlayers(teamMembers);
        }

        return ResponseEntity.ok(team);
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        teams.add(team);
        return team;
    }

    @PutMapping("/{id}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team updatedTeam) {
        Team existingTeam = teams.stream()
                .filter(team -> team.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (existingTeam != null) {
            existingTeam.setName(updatedTeam.getName());
        }
        return existingTeam;
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teams.removeIf(team -> team.getId().equals(id));
    }
}
