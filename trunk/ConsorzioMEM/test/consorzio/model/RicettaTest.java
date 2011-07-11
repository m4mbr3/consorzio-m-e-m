package consorzio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RicettaTest extends AppEngineTestCase {

    private Ricetta model = new Ricetta();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
