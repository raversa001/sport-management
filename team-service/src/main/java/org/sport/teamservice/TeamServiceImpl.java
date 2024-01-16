// TeamServiceImpl.java
package org.sport.teamservice;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TeamServiceImpl implements TeamService {
    private final Map<Long, Team> teamMap = new HashMap<>();
    private Long currentId = 1L;

    @Override
    public Team getTeamById(Long id) {
        return teamMap.get(id);
    }

    @Override
    public Team createTeam(Team team) {
        Long id = currentId++;
        team.setId(id);
        teamMap.put(id, team);
        return team;
    }

    @Override
    public Team updateTeam(Long id, Team updatedTeam) {
        if (teamMap.containsKey(id)) {
            updatedTeam.setId(id);
            teamMap.put(id, updatedTeam);
            return updatedTeam;
        }
        return null; // Équipe non trouvée
    }

    @Override
    public void deleteTeam(Long id) {
        teamMap.remove(id);
    }
}
