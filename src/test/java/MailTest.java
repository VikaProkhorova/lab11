import Task2.Client;
import Task2.MailBox;
import Task2.MailCode;
import Task2.MailInfo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailTest {
    @Test
    public void testAssert() {
        Client client = new Client(0, "Alice", 18, false);
        assertEquals(client.getId(), 0);
        assertEquals(client.getName(), "Alice");
        assertEquals(client.getAge(), 18);
        assertFalse(client.isSex());
    }
    @Test
    public void testMailBox() {
        Client client = new Client(0, "Alice", 18, false);
        MailBox box = new MailBox();
        box.addMailInfo(new MailInfo(client, MailCode.Gift));
        box.addMailInfo(new MailInfo(client, MailCode.Birthday));
        assertEquals(box.getInfos().size(), 2);
    }
}

