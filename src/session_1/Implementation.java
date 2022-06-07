package session_1;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    private static List<Candidates> candidatesList = new ArrayList<>();

    public static List<Candidates> getCandidatesList() {
        return candidatesList;
    }

    public void setCandidatesList(List<Candidates> candidatesList) {
        this.candidatesList = candidatesList;
    }

    public static void createCandidate(String firstName, String lastName, String email, String phone){
        Candidates candidate = new Candidates(firstName, lastName, email, phone);
        candidatesList.add(candidate);
    }

    public Candidates mostTakenSurveys(){
        int nextSurveysCount = 0;
        Candidates mostTakenSurveys = null;
        for(Candidates candidate : candidatesList){
            if (Candidates.getSurveysTaken() > nextSurveysCount){
                mostTakenSurveys = candidate;
                nextSurveysCount = Candidates.getSurveysTaken();
            }
            else {
                return null;
            }

        }
        return mostTakenSurveys;
    }
}
