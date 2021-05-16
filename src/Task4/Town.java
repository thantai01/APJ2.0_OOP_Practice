package Task4;

public class Town extends Family{
    private int n = 0;
    private Town[] towns = new Town[100];

    public void add(Town family){
        towns[n] = family;
        n++;
    }

}
