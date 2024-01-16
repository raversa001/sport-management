package org.sport.playerservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> players = new ArrayList<>();
    private Long nextId = 1L;

    public Player getPlayerById(Long id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                return player;
            }
        }
        return null;
    }

    public Player addPlayer(Player player) {
        player.setId(nextId);
        players.add(player);
        nextId++;
        return player;
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.getId().equals(id)) {
                updatedPlayer.setId(id);
                players.set(i, updatedPlayer);
                return updatedPlayer;
            }
        }
        return null;
    }

    public void deletePlayer(Long id) {
        players.removeIf(player -> player.getId().equals(id));
    }
}
