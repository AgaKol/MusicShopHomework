package accessories;

import instruments.InstrumentType;

public class GuitarStrings extends Accessory{

    private String gauge;
    private InstrumentType forInstrument;

    public GuitarStrings(double priceBought, double priceSold, String name, String brand, String gauge) {
        super(priceBought, priceSold, name, brand);
        this.gauge = gauge;
        this.forInstrument = InstrumentType.STRINGS;
    }

    public String getGauge() {
        return gauge;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }

    public InstrumentType getForInstrument() {
        return forInstrument;
    }
}
