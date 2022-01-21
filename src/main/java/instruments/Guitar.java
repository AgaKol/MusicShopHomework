package instruments;

import accessories.GuitarStrings;

public class Guitar extends Instrument {

    private String dexterity;
    private GuitarStrings strings;
    private int stringNumber;

    public Guitar(double priceBought, double priceSold, String name, InstrumentType type, String colour, String brand, String dexterity, GuitarStrings strings, int stringNumber) {
        super(priceBought, priceSold, name, type, colour, brand);
        this.dexterity = dexterity;
        this.strings = strings;
        this.stringNumber = stringNumber;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public GuitarStrings getStrings() {
        return strings;
    }

    public void setStrings(GuitarStrings strings) {
        this.strings = strings;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }


    @Override
    public String play() {
        return "Twang";
    }
}
