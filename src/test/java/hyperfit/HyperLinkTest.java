package hyperfit;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.UUID;

public class HyperLinkTest {

    @Test
    public void testGettersAndSetters(){
        String random = UUID.randomUUID().toString();
        String random2 = UUID.randomUUID().toString();
        boolean bool = false;

        HyperLink h = new HyperLink(random, random2, bool);

        assertEquals(random, h.getRel());
        assertEquals(random2, h.getHref());
        assertEquals(bool, h.isTemplated());

    }

}
