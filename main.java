import java.util.List;

import A.*;

class Main {
    public static void main(String[] args) {
        List<cow> cowList = new ArrayList<cow>();
        //public cow c1 = new cow(11111111,"W",5,10);
        cowList.add(new cow("12345678", "white", 3, 5, 0, false));
        cowList.add(new cow("23456789", "brown", 2, 3, 0, false));
        cowList.add(new cow("34567890", "white", 4, 8, 0, false));
        cowList.add(new cow("45678901", "brown", 5, 6, 0, false));
        cowList.add(new cow("56789012", "white", 1, 11, 0, false));
        a.mainview();
        
    }
}
