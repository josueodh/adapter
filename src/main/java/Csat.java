public class Csat {

    ICsatRating csatRating;
    CsatAdapter csatAdapter;

    public Csat(){
        csatRating = new CsatSatisfection();
        csatAdapter = new CsatAdapter(csatRating);
    }

    public void setEvaluation(String evaluation){
        csatRating.setCsatRating(evaluation);
        csatAdapter.saveGrade();
    }

    public String getEvaluation(){
        return csatAdapter.recoverSatisfection();
    }

    public int getRating(){
        return csatAdapter.getCsatGrade();
    }
}
