package se.lexicon.model;

public class Chips extends Product {
    private String flavor;

    public Chips(double price, String productName, String flavor) {
        super(price, productName);
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(String flavor) {
        if ((flavor == null) || (flavor.isEmpty()) ) throw new IllegalArgumentException("Flavor can't be empty or set to null");
        this.flavor = flavor;
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
        sb.append("flavor='").append(flavor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
