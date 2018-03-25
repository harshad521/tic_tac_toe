import com.thoughtworks.ticTacToeLib.Field;
import com.thoughtworks.ticTacToeLib.Player;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class playerTest {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player( Field.Symbol.O,"Harshad");
    }

    @Test
    public void checkName() {
        assertThat( player.getName(),is("Harshad"));
    }

    @Test
    public void checkSymbol(){
        assertThat( player.getSymbol(),is(Field.Symbol.O) );
    }
}
