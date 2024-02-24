package design.stackOverFlow;

import java.util.List;

public class Question {

    private String title;

    private String content;

    private List<Answer> answerList;

    public Question(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void addAnswer ( Answer answer ) {
        answerList.add(answer);
    }
}
