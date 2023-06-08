public class Salary extends MailMessage {
    String from;
    String to;
    Integer contentInt;

    Salary(String from, String to, Integer contentInt) {
        this.from = from;
        this.to = to;
        this.contentInt = contentInt;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContentInt() {
        return contentInt;
    }
}
