package consorzio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ImmagineTest extends AppEngineTestCase {

    private Immagine model = new Immagine();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
