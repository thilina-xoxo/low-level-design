package design.PubSubSystem;

public class Message {
    private String message;
    private Topic topic;

    public Message(String message, Topic topic) {
        this.message = message;
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public Topic getTopic() {
        return topic;
    }
}
