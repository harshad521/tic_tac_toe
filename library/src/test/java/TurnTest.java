import com.thoughtworks.ticTacToeLib.Field;
import com.thoughtworks.ticTacToeLib.Turn;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    private Turn turn;

    @Before
    public void setUp() throws Exception {
        turn = new Turn( new Field.Symbol[]{Field.Symbol.X, Field.Symbol.O} );
    }

    @Test
    public void getCurrentPlayer() {
        assertThat(turn.getCurrentPlayer(),is(Field.Symbol.X));
    }

    @Test
    public void changeTurn() {
        turn.changeTurn();
        assertThat( turn.getCurrentPlayer(),is( Field.Symbol.O ) );
    }
}
