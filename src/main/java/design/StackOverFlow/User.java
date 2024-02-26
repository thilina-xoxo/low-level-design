package design.StackOverFlow;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // post a question
    public Question postQuestion (String title, String content) {
        return new Question(title, content,this);
    }

    // post an answer
    public Answer postAnswer (Question question, String answerText) {
        Answer answer = new Answer(answerText);
        question.addAnswer(answer);
        return answer;
    }

    // upvote or downvote
    public Vote selectVote (Question question, String type) {
        question.getVote().setVoteValue(type);
        return question.getVote();
    }

}
