package org.sport.statsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player-stats")
public class PlayerStatsController {

    @Autowired
    private PlayerStatsService playerStatsService;

    @GetMapping("/{playerId}")
    public ResponseEntity<PlayerStats> getPlayerStats(@PathVariable Long playerId) {
        PlayerStats playerStats = playerStatsService.getPlayerStats(playerId);
        if (playerStats != null) {
            return ResponseEntity.ok(playerStats);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
