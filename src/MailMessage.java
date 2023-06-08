public class MailMessage {
    String from;
    String to;
    String content;
    Integer contentInt;

    MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public MailMessage() {
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;

    }

    public Integer getContentInt() {
        return contentInt;

    }

}
