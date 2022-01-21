package shop;

import behaviours.ISell;

public abstract class SellableItem implements ISell {

    private double priceBought;
    private double priceSold;

    public SellableItem(double priceBought, double priceSold) {
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public void setPriceSold(double priceSold) {
        this.priceSold = priceSold;
    }
}
