public class CsatSatisfection implements ICsatRating{

    private String satisfaction;

    @Override
    public String getCsatRating() {
        return this.satisfaction;
    }

    @Override
    public void setCsatRating(String rating) {
        this.satisfaction = rating;
    }
}
