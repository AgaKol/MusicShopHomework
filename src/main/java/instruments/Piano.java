package instruments;

public class Piano extends Instrument{


    private int keysNumber;

    public Piano(double priceBought, double priceSold, String name, InstrumentType type, String colour, String brand, int keysNumber) {
        super(priceBought, priceSold, name, type, colour, brand);
        this.keysNumber = keysNumber;
    }

    public int getKeysNumber() {
        return keysNumber;
    }

    public void setKeysNumber(int keysNumber) {
        this.keysNumber = keysNumber;
    }

    @Override
    public String play() {
        return "Plink";
    }
}
