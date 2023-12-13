package se.lexicon.model;

import se.lexicon.Enum.CandyBarFlavour;

public class CandyBar extends Product {
    private String flavor;

    public CandyBar(double price, String productName, CandyBarFlavour flavor) {
        super(price, productName);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(CandyBarFlavour flavour) {
        if (flavour == null) throw new IllegalArgumentException("Flavour can't be set to null");
        this.flavor = flavour.getFlavour();
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
        sb.append("CandyBar{");
        sb.append("flavor='").append(flavor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
