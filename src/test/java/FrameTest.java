import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FrameTest {

    private Frame frame;

    @Before
    public void setUp() throws Exception {
        frame = new Frame();
    }


    @Test
    public void isItAStrike() {
        frame.setTurn1(10);
        frame.setTurn2(0);

        boolean strike = frame.isItAStrike();

        assertThat(strike, equalTo(true));
    }

    @Test
    public void isItASpare() {
        frame.setTurn1(3);
        frame.setTurn2(7);

        boolean spare = frame.isItASpare();
        assertThat(spare, equalTo(true));
    }
}
