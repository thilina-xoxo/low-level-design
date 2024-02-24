package design.stackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String title;

    private String content;

    private User askedBy;

    private List<Answer> answerList;

    private List<Comment> commentList;

    private Vote vote ;

    public Question(String title, String content, User askedBy) {
        this.title = title;
        this.content = content;
        this.askedBy = askedBy;
        this.answerList = new ArrayList<>();
        this.commentList = new ArrayList<>();
    }

    public void addAnswer ( Answer answer ) {
        answerList.add(answer);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public Vote getVote() {
        return vote;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }
}
