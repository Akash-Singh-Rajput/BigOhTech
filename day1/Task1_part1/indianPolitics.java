package Task1_part1;

public class indianPolitics {
    public static void main(String[] args) {
        pm pm = new pm("Narendar Modi" , "sanju" , "airline");
        minister minister = new minister("fjdkfjd" , "kdjf");
        minister.spend(1000000000);
        commisioner cm = new commisioner();
        System.out.println(cm.canArrestMinister(minister , pm));

    }
}
