package org.sport.teamservice;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {

    private List<Match> matches = new ArrayList<>();

    public Match getMatchById(Long id) {
        // Implémentez la logique pour récupérer un match par son ID
        return matches.stream()
                .filter(match -> match.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Match createMatch(Match match) {
        matches.add(match);
        return match;
    }

    public Match updateMatch(Long id, Match match) {
        // Implémentez la logique pour mettre à jour un match existant par son ID
        Match existingMatch = getMatchById(id);
        if (existingMatch != null) {
            // Mettez à jour les attributs du match existant avec les valeurs du nouveau match
            existingMatch.setDate(match.getDate());
            existingMatch.setIdTeam1(match.getIdTeam1());
            existingMatch.setIdTeam2(match.getIdTeam2());
            existingMatch.setLocation(match.getLocation());
            existingMatch.setIdWinner(match.getIdWinner());
            // Mettez à jour d'autres attributs...
            return existingMatch;
        } else {
            return null;
        }
    }

    public void deleteMatch(Long id) {
        // Implémentez la logique pour supprimer un match par son ID
        matches.removeIf(match -> match.getId().equals(id));
    }
}
