package accessories;

public class SheetMusic extends Accessory {

    private String composer;

    public SheetMusic(double priceBought, double priceSold, String name, String brand, String composer) {
        super(priceBought, priceSold, name, brand);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
}
