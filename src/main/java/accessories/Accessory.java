package accessories;

import shop.SellableItem;

public abstract class Accessory extends SellableItem {

    private String name;
    private String brand;

    public Accessory(double priceBought, double priceSold, String name, String brand) {
        super(priceBought, priceSold);
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
