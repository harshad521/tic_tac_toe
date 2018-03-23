import com.thoughtworks.ticTacToeLib.Board;
import com.thoughtworks.ticTacToeLib.Field;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board( 3 );
    }

    @Test
    public void checkSizeOfGrid() {
        assertThat( board.getSize(),is(3) );
    }

    @Test
    public void checkOwnerOfField() {
        assertThat( board.getOwner(0,0) ,is( Field.Symbol.NONE));
    }

    @Test
    public void setOwnerOfField() {
        board.setOwner(0,0,Field.Symbol.X);
        assertThat( board.getOwner( 0 ,0) ,is( Field.Symbol.X ));
    }

}
