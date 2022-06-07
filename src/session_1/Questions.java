package session_1;

public class Questions {
    private String question;
    private int surveyId;
    private int id;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Questions(String question, int surveyId){
        this.question = question;
        this.surveyId = surveyId;
}

}
