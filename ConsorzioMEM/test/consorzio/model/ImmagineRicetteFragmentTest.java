package consorzio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ImmagineRicetteFragmentTest extends AppEngineTestCase {

    private ImmagineRicetteFragment model = new ImmagineRicetteFragment();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
