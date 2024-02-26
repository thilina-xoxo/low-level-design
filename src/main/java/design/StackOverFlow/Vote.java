package design.StackOverFlow;

public class Vote {

    static final String UPVOTE = "UP";
    static final String DOWNVOTE = "DOWN";

    private int value = 0 ;

    public void setVoteValue (String type) {
        if (type.equalsIgnoreCase(UPVOTE)) {
            value++;
        }
        if (type.equalsIgnoreCase(DOWNVOTE)) {
            value--;
        }
    }
}
