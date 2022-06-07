package session_1;

public class Responses {

    private String question;
    private String answer;
    public int surveyId;
    public int questionId;
    public int candidateId;

    public Responses(String question, String answer, int surveyId, int questionId){
        this.question = question;
        this.answer = answer;
        this.surveyId = surveyId;
        this.questionId = questionId;
        this.candidateId = candidateId;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}


