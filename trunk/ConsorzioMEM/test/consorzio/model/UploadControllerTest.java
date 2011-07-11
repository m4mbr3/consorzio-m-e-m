package consorzio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UploadControllerTest extends AppEngineTestCase {

    private UploadController model = new UploadController();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
