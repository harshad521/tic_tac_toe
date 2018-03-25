import com.thoughtworks.ticTacToeLib.Field;
import com.thoughtworks.ticTacToeLib.Game;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game(3,new String[] {"Viraj", "Harshad"});
    }

    @Test
    public void validateAddingPlayer() {
        assertThat(game.getPlayerNameBySymbol(Field.Symbol.X), is("Viraj"));
    }

}
