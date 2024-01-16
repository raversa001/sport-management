// TeamService.java
package org.sport.teamservice;

public interface TeamService {
    Team getTeamById(Long id);
    Team createTeam(Team team);
    Team updateTeam(Long id, Team updatedTeam);
    void deleteTeam(Long id);
}
