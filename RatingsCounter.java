public class RatingsCounter {

    private int sofifaID;
    public Double globalRating;
    public int counter;
    
    public RatingsCounter(int sofifaID, double globalRating, int counter) {
        this.sofifaID = sofifaID;
        this.globalRating = globalRating;
        this.counter = counter;
    }
    public int getSofifaID() {
        return sofifaID;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public double getGlobalRating() {
        return globalRating;
    }
    public void setGlobalRating(double globalRating) {
        this.globalRating = globalRating;
    }
    public void setSofifaID(int sofifaID) {
        this.sofifaID = sofifaID;
    }
    @Override
    public String toString() {
        return "RatingsCounter [sofifaID=" + sofifaID + ", globalRating=" + globalRating + ", counter=" + counter + "]";
    }

}
