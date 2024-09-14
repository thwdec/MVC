package A;

public class cow {
    public String id;
    public String color;
    public int ageyear;
    public int agemoth;
    public int countMilk=0;
    public boolean BSOD = false;


    public cow(String id,String color,int ageyear,int agemoth,int countMilk,boolean BSOD) {
        this.id = id;
        this.color = color;
        this.ageyear = ageyear;
        this.agemoth = agemoth;
        this.countMilk = countMilk;
        this.BSOD = BSOD;
    }
}