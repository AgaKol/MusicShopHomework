package accessories;

public class DrumStick extends Accessory{

    private String size;
    private String material;

    public DrumStick(double priceBought, double priceSold, String name, String brand, String size, String material) {
        super(priceBought, priceSold, name, brand);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
