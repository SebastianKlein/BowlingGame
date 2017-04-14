import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Test
    public void createGame() {
        bowlingGame = new BowlingGame("Sebastian", "Bisu", "Gauti");
        assertThat(bowlingGame.getPlayers().size(), equalTo(3));
    }


}
