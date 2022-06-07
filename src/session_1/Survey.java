package session_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Survey {
    private String title;
    private String topic;
    private String description;
    private int id;
    private ArrayList<Questions> questions = new ArrayList<Questions>();

    public Survey(String title, String topic, String description, String[] questions){
        this.title = title;
        this.topic = topic;
        this.description = description;
        addQuestion(questions);
    }


    public void addQuestion(String[] questionsList){

        for (String questionContent : questionsList){
            Questions question = new Questions(questionContent, id);
            questions.add(question);
        }

    }

    public void removeQuestion(int questionId){
        Questions questionToRemove = null;
        for(Questions question : questions){
            if (question.getId() == questionId){
                questionToRemove = question;
            }
        }
        questions.remove(questionToRemove);
    }
    public void checkQuestion(Candidates candidates, int questionId){
        Questions checkedQuestion = null;
        for(Questions question : questions){
            if (question.getId() == questionId){
                int percentage = (question.answers / Implementation.getCandidatesList().size()) * 100;
                if (percentage < 50){
                    checkedQuestion = question;
                }
            }
        }
        if (checkedQuestion != null){
            questions.remove(checkedQuestion);
        }
    }

}