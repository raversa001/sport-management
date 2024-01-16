package org.sport.teamservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private MatchService matchService = new MatchService();

    public MatchController(MatchService matchService) {
        this.matchService = matchService;

        // Créez 4 à 5 matchs initiaux avec des données de matchs lambda
        matchService.createMatch(new Match(1L, 1L, 2L, "2024-01-20", "Stade A", 1L));
        matchService.createMatch(new Match(2L, 2L, 3L, "2024-01-22", "Stade B", 3L));
        matchService.createMatch(new Match(3L, 1L, 3L, "2024-01-24", "Stade C", 1L));
        matchService.createMatch(new Match(4L, 3L, 2L, "2024-01-26", "Stade D", 2L));
        matchService.createMatch(new Match(5L, 1L, 2L, "2024-01-28", "Stade E", 1L));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long id) {
        Match match = matchService.getMatchById(id);
        if (match != null) {
            return ResponseEntity.ok(match);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Match> createMatch(@RequestBody Match match) {
        Match createdMatch = matchService.createMatch(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMatch);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Match> updateMatch(@PathVariable Long id, @RequestBody Match match) {
        Match updatedMatch = matchService.updateMatch(id, match);
        if (updatedMatch != null) {
            return ResponseEntity.ok(updatedMatch);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }

    // Autres méthodes pour gérer les matchs...
}
