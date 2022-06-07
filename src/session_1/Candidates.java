package session_1;

import java.util.ArrayList;

public class Candidates {
    private String FirstName;
    private String LastName;
    private String Email;
    private int PhoneNumber;
    private static int surveysTaken = 0;

    public Candidates(String firstName, String lastName, String email, String phone) {
    }

    public Candidates() {
    }

    public static int getSurveysTaken() {
        return surveysTaken;
    }

    public void setSurveysTaken(int surveysTaken) {
        this.surveysTaken = surveysTaken;
    }

    private ArrayList<Responses> answers = new ArrayList<>();

    public Candidates(String firstName, String lastName, String email, int phoneNumber,int surveysTaken) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        PhoneNumber = phoneNumber;
        surveysTaken=surveysTaken;
    }
    public void saveAnswers(String question, String answer, int surveyId, int questionId){
        Responses newAnswer = new Responses(question, answer, surveyId, questionId);
        answers.add(newAnswer);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public ArrayList<Responses> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Responses> answers) {
        this.answers = answers;
    }


}
