import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlayerTest {

    @Test
    public void create_player(){
        Player p = new Player("Bisu");
        assertThat(p.getName(), equalTo("Bisu"));
    }
}
