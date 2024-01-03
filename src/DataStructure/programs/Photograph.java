package programs;

public class Photograph implements Sellable{

    private final String descript;
    private final int price;
    private final boolean color;


    public Photograph(String desc, int p, boolean c) {

        descript = desc;
        price = p;
        color = c;

    }

    @Override
    public String description() {
        return descript;
    }

    @Override
    public int listPrice() {
        return price/2;
    }

    @Override
    public int lowestPrice() {
        return price;
    }

    public boolean isColor() {

        return color;

    }
}
