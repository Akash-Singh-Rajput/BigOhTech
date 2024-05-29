package Task1_part1;

public class mp {
    private final static int limit = 100000;
    int totalSpend = 0;
    String constituency;
    String driver;
    public mp(String constituency, String driver){
        this.constituency = constituency;
        this.driver = driver;
    }
    public String getDriver(){
        return driver;
    }
    public String getConstituency(){
        return constituency;
    }
    public boolean exceedsSpendingLimit(){
        return totalSpend > limit;
    }
    public void spend(int cost){
        totalSpend += cost;
    }
}
