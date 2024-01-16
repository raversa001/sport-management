package org.sport.teamservice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    public List<Team> teams = new ArrayList<>();

    public TeamController() {
        // Initialisation avec deux équipes de données lambda
        teams.add(new Team(1L, "Équipe A"));
        teams.add(new Team(2L, "Équipe B"));
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teams.stream()
                .filter(team -> team.getId().equals(id))
                .findFirst()
                .orElse(null);
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
