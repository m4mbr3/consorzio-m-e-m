package consorzio.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TuttiProdottiServiceTest extends AppEngineTestCase {

    private TuttiProdottiService service = new TuttiProdottiService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
