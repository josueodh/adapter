public class CsatAdapter extends CsatGrade{
    private ICsatRating csatRating;

    public CsatAdapter(ICsatRating csatRating){
        this.csatRating = csatRating;
    }

    public String recoverSatisfection(){
        if(this.getCsatGrade() == 1){
            csatRating.setCsatRating("Very unsatisfied");
        }else if(this.getCsatGrade() == 2){
            csatRating.setCsatRating("Unsatisfied");
        }else if(this.getCsatGrade() == 3){
            csatRating.setCsatRating("Neutral");
        }else if(this.getCsatGrade() == 4){
            csatRating.setCsatRating("Satisfied");
        }else if(this.getCsatGrade() == 5){
            csatRating.setCsatRating("Very satisfied");
        }

        return csatRating.getCsatRating();
    }


    public void saveGrade(){
        if(csatRating.getCsatRating().equals("Very unsatisfied")){
            this.setCsatGrade(1);
        }else if(csatRating.getCsatRating().equals("Unsatisfied")) {
            this.setCsatGrade(2);
        }else if(csatRating.getCsatRating().equals("Neutral")) {
            this.setCsatGrade(3);
        }else if(csatRating.getCsatRating().equals("Satisfied")) {
            this.setCsatGrade(4);
        }
        else if(csatRating.getCsatRating().equals("Very satisfied")) {
            this.setCsatGrade(5);
        }
    }


}
