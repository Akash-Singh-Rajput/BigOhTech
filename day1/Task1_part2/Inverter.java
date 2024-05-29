package Task1_part2;

public class Inverter {
    int current;
    int voltage;
    int rating;
    public Inverter(int current , int voltage){
        this.current = current;
        this.voltage = voltage;
    }

    public int rating(){
        return current * voltage;
    }

}
