package Task1_part1;

public class minister extends mp{
    private static final int limit = 1000000;
    int totalSpend = 0;

    public minister(String constituency , String driver){
        super(constituency , driver);
    }

    public boolean exceedsLimit(){
        return totalSpend > limit;
    }

    public void spend(int cost){
        totalSpend += cost;
    }

}
