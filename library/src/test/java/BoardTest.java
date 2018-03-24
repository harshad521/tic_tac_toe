import com.thoughtworks.ticTacToeLib.Board;
import com.thoughtworks.ticTacToeLib.Field;
import com.thoughtworks.ticTacToeLib.InvalidMoveException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
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
    public void setOwnerOfField() throws InvalidMoveException {
        board.setOwner(0,0,Field.Symbol.X);
        assertThat( board.getOwner( 0 ,0) ,is( Field.Symbol.X ));
    }

    @Test(expected = InvalidMoveException.class)
    public void checkForInvalidMovePlayerTryingToPlaceInHisOwnedField()throws InvalidMoveException {
        board.setOwner( 0,0, Field.Symbol.X );
        board.setOwner( 0,0, Field.Symbol.X );
    }

    @Test(expected = InvalidMoveException.class)
    public void checkForInvalidMovePlayerTryingToPlaceInOpponedField()throws InvalidMoveException {
        board.setOwner( 0,0, Field.Symbol.O );
        board.setOwner( 0,0, Field.Symbol.X );
    }

    @Test
    public void checkWinner() {
        assertThat(board.getWinner(),is( Field.Symbol.NONE ));
    }

    @Test
    public void evaluateWinnerHorizontally() throws InvalidMoveException {
        board.setOwner( 0,0, Field.Symbol.X );
        board.setOwner( 0,1, Field.Symbol.X );
        board.setOwner( 0,2, Field.Symbol.X );
        assertThat(board.getWinner(),is(Field.Symbol.X));
    }

    @Test
    public void evaluateWinnerVertically() throws InvalidMoveException {
        board.setOwner( 1,0, Field.Symbol.O );
        board.setOwner( 2,0, Field.Symbol.O );
        board.setOwner( 0,0, Field.Symbol.O );
        assertThat(board.getWinner(),is(Field.Symbol.O));
    }

    @Test
    public void evaluateWinnerLeftToRightDiagonally() throws InvalidMoveException{
        board.setOwner( 0,0, Field.Symbol.O );
        board.setOwner( 1,1, Field.Symbol.O );
        board.setOwner( 2,2, Field.Symbol.O );
        assertThat(board.getWinner(),is(Field.Symbol.O));
    }

    @Test
    public void evaluateWinnerRightToLeftDiagonal() throws InvalidMoveException{
        board.setOwner( 0,2, Field.Symbol.X );
        board.setOwner( 1,1, Field.Symbol.X );
        board.setOwner( 2,0, Field.Symbol.X );
        assertThat(board.getWinner(),is(Field.Symbol.X));
    }

    @Test
    public void shouldNotDeclareWinner_DiagonalTest()throws InvalidMoveException {
        board.setOwner( 0,2, Field.Symbol.X );
        board.setOwner( 1,1, Field.Symbol.X );
        board.setOwner( 2,0, Field.Symbol.O );
        assertThat(board.getWinner(),is(Field.Symbol.NONE));
    }

    @Test
    public void shouldNotDeclareWinner_rowTest()throws InvalidMoveException {
        board.setOwner( 0,0, Field.Symbol.X );
        board.setOwner( 0,1, Field.Symbol.X );
        board.setOwner( 0,2, Field.Symbol.O );
        assertThat(board.getWinner(),is(Field.Symbol.NONE));
    }

    @Test
    public void shouldNotDeclareWinner_columnTest() throws InvalidMoveException{
        board.setOwner( 0,0, Field.Symbol.O );
        board.setOwner( 1,0, Field.Symbol.O );
        board.setOwner( 2,0, Field.Symbol.X );
        assertThat(board.getWinner(),is(Field.Symbol.NONE));

    }
}
