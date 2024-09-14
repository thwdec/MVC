package A;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<cow> cowList = new ArrayList<cow>();

    //methord check
    public boolean check(String id) {
        for (cow cow : cowList) {
            if(cow.id.equals(id)) return true;
        }
        return false;
    }
    public cow getCow(String id){
        for (cow cow : cowList) {
            if(cow.id.equals(id)) return cow;
        }
        return null;
    }


}
