package se.lexicon.model;

import se.lexicon.Enum.ChipsFlavour;

public class Chips extends Product {
    private String flavour;

    public Chips(double price, String productName, String description, ChipsFlavour flavour) {
        super(price, productName, description);
        setFlavour(flavour);
    }

    public String getFlavour() {
        return flavour;
    }

    private void setFlavour(ChipsFlavour flavour) {
        if (flavour == null) throw new IllegalArgumentException("Flavour can't be set to null");
        this.flavour = flavour.getFlavour();
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        final StringBuilder sb = new StringBuilder(superString + "\n");
        sb.append("Chips{");
        sb.append("flavor='").append(flavour).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
