import ua.edu.ucu.Task3.ProxyImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImageTest {
    @Test
    public void TestProxy() {
        ProxyImage proxy = new ProxyImage("new.png");
        proxy.display();
        assertNotNull(proxy.getImage());
    }
}
