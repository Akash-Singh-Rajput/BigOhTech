package Task1_part1;

public class pm extends minister{
    private static final int limit = 100000000;
    String aircraft;
    int totalSpend = 0;

    public pm(String constituency , String driver , String aircraft){
        super(constituency , driver);
        this.aircraft = aircraft;

    }
    public void getAirCraft(){
        System.out.println(aircraft);
    }

    public boolean grantPermissionToArrestMinister(){
        return true;
    }

    public boolean exceedsLimit(){
        return totalSpend > limit;
    }

    public void spend(int cost){
        totalSpend += cost;
    }
}
