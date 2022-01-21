package instruments;

public class Drums extends Instrument{

    private int drumsNumber;
    private String material;

    public Drums(double priceBought, double priceSold, String name, InstrumentType type, String colour, String brand, int drumsNumber, String material) {
        super(priceBought, priceSold, name, type, colour, brand);
        this.drumsNumber = drumsNumber;
        this.material = material;
    }

    public int getDrumsNumber() {
        return drumsNumber;
    }

    public void setDrumsNumber(int drumsNumber) {
        this.drumsNumber = drumsNumber;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String play() {
        return "Boom, boom, boom!";
    }
}
