import com.thoughtworks.ticTacToeLib.Field;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FieldTest {
    Field field;

    @Before
    public void setUp() throws Exception {
        field = new Field( 'X',1);
    }

    @Test
    public void checkFieldOwner() {
        assertThat( field.getCoinOwner(),is('X'));
    }

    @Test
    public void checkFieldId() {
        assertThat( field.getId(),is(1) );
    }

}
