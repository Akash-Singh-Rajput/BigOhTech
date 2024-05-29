package Task1_part2;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ChooseInverter {
    GridSolarInverted GTI = new GridSolarInverted(10 , 10);
    BatterySolarInverter PCU = new BatterySolarInverter(10 , 10);
    Inverter zelio = new Inverter(10 , 10);
    Inverter icruze = new Inverter(10 , 10);
    SolarInverter regalia = new SolarInverter(10 , 10);

    ArrayList<Inverter> list = new ArrayList<>();
    public ChooseInverter(){
        list.add(GTI);
        list.add(PCU);
        list.add(zelio);
        list.add(icruze);
        list.add(regalia);
    }
}
