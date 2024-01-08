package task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public static void sendMail (MailInfo mailInfo) throws MailjetSocketTimeoutException, MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        String text = mailInfo.generate();
        client = new MailjetClient("2c7870fccad4ee8b167ab6f26ab8570e", "914174e8ed7b65f89474dc3ea653acf1", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "prokhorova.pn@ucu.edu.ua")
                                        .put("Name", "Victoria"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "prokhorova.pn@ucu.edu.ua")
                                                .put("Name", "Victoria")))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
                                .put(Emailv31.Message.TEXTPART, text)
                                .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />May the delivery force be with you!")
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);


    }
}
