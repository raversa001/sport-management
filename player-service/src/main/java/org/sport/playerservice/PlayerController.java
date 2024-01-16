package org.sport.playerservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private PlayerService playerService = new PlayerService();

    public PlayerController() {
        playerService.addPlayer(new Player(1L, "Richard Aversa", 1L, 1, 0, 0));
        playerService.addPlayer(new Player(2L, "Morgan Sauvignon", 1L, 1, 1, 0));
        playerService.addPlayer(new Player(3L, "Lucas Blanc", 1L, 1, 3, 0));

        playerService.addPlayer(new Player(4L, "Matthias Bardy", 2L, 1, 0, 1));
        playerService.addPlayer(new Player(5L, "Quentin Guillou", 2L, 1, 1, 0));
        playerService.addPlayer(new Player(6L, "Johann Avramov", 2L, 1, 0, 0));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return ResponseEntity.ok(playerService.getAllPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        Player player = playerService.getPlayerById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player addedPlayer = playerService.addPlayer(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPlayer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(id, player);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}
