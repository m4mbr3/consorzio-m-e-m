package consorzio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ImmagineFragmentTest extends AppEngineTestCase {

    private ImmagineFragment model = new ImmagineFragment();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
