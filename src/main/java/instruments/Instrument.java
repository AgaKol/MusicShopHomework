package instruments;

import behaviours.IPlay;
import shop.SellableItem;

public abstract class Instrument extends SellableItem implements IPlay {

    private String name;
    private InstrumentType type;
    private String colour;
    private String brand;

    public Instrument(double priceBought, double priceSold, String name, InstrumentType type, String colour, String brand) {
        super(priceBought, priceSold);
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
