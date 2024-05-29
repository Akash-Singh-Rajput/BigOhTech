package Task1_part1;

import java.util.*;

public class commisioner{
    public boolean canArrestMinister(minister minister , pm pm){
        if(pm.grantPermissionToArrestMinister() && minister.exceedsLimit()){
            return true;
        }
        return false;
    }

    public boolean canArrestMP(mp mp){
        if(mp.exceedsSpendingLimit()){
            return true;
        }else {
            return false;
        }
    }
}
