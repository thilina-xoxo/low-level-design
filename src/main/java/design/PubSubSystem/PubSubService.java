package design.PubSubSystem;

import java.util.*;

public class PubSubService {
    private Queue<Message> messageQueue;
    private Map<String, List<Subscriber>> subscriberTopicMap = new HashMap<>();

    public void addMessageToQueue(Message message) {
        messageQueue.add(message);
    }

    public void addSubscriber(String topicName, Subscriber subscriber) {
        if(subscriberTopicMap.containsKey(topicName)) {
            subscriberTopicMap.get(topicName).add(subscriber);
        }
        subscriberTopicMap.put(topicName,new ArrayList<>());
    }

    public void removeSubscriber(String topicName, Subscriber subscriber) {
        //
    }

    public void broadcast() {
        while(!messageQueue.isEmpty()) {
            Message getAndRemoveFirst = messageQueue.poll();
            Topic topicForMessage = getAndRemoveFirst.getTopic();
            List<Subscriber> messageSubscribers = subscriberTopicMap.get(topicForMessage);
            for (Subscriber subscriber:messageSubscribers
                 ) {
                subscriber.receive(getAndRemoveFirst);
            }
        }
    }
}


