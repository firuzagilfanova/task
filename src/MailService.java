import javax.lang.model.type.NullType;
import javax.management.DescriptorAccess;
import java.util.*;
import java.util.function.Consumer;


public class MailService<S> implements Consumer<MailMessage> {
    List<MailMessage> Mails = new ArrayList<>();
    Map<String, List<S>> myMaps = new DefaultHashMap<String, List<S>>((List<S>) Collections.<String>emptyList());

    @Override
    public void accept(MailMessage mailMessage) {
        Mails.add(mailMessage);
    }

    MailService() {
    }

    public Map<String, List<S>> getMailBox() {

        for (MailMessage mail : Mails) {
            if (!myMaps.containsKey(mail.getTo())) {
                myMaps.put(mail.getTo(), new ArrayList<S>());
            }

            if (mail.getContent() instanceof String) {
                myMaps.get(mail.getTo()).add((S) mail.getContent());
            } else {
                myMaps.get(mail.getTo()).add((S) mail.getContentInt());
            }
        }
        return myMaps;
    }
}

