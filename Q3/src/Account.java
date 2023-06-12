public class Account implements OnlineAccount , Comparable<OnlineAccount>{


    private  Integer noOfRegularMovies;
    private Integer noOfExclusiveMovies;
    private String ownerName;
    @Override
    public Integer monthlyCost() {
        return (basePrice + (regularMoviePrice*noOfRegularMovies) + (noOfExclusiveMovies*exclusiveMoviePrice));
    }

    @Override
    public int compareTo(OnlineAccount onlineAccount) {
        if (this.monthlyCost() == onlineAccount.monthlyCost()){
            return  0;
        }
        return this.monthlyCost() > onlineAccount.monthlyCost() ? 1 : -1 ;
    }

    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + this.monthlyCost() +" USD.";
    }

    public Account(Integer noOfRegularMovies, Integer noOfExclusiveMovies, String ownerName) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }




}
