import com.thoughtworks.ticTacToeLib.Field;
import org.junit.Before;
import org.junit.Test;


import static com.thoughtworks.ticTacToeLib.Field.Symbol.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FieldTest {
    private Field field;

    @Before
    public void setUp()  {
        field = new Field();
    }

    @Test
    public void checkFieldOwner() {
        assertThat( field.getFieldOwner(),is(NONE));
    }

    @Test
    public void set_X_As_FieldOwner() {
        field.setOwner(X);
        assertThat(field.getFieldOwner(),is(X));
    }

    @Test
    public void set_Y_As_FieldOwner() {
        field.setOwner(O);
        assertThat(field.getFieldOwner(),is(O));
    }
}
