import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private List<Player> players;
    public BowlingGame(String ... playerNames) {
        this.players = new ArrayList<Player>();

        for(String pn: playerNames)
        players.add(new Player(pn));
    }

    public List<Player> getPlayers() {
        return players;
    }
}
