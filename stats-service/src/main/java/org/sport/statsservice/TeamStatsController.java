package org.sport.statsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team-stats")
public class TeamStatsController {

    @Autowired
    private TeamStatsService teamStatsService;

    @GetMapping("/{teamId}")
    public ResponseEntity<TeamStats> getTeamStats(@PathVariable Long teamId) {
        TeamStats teamStats = teamStatsService.getTeamStats(teamId);
        if (teamStats != null) {
            return ResponseEntity.ok(teamStats);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
