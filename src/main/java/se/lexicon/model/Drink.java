package se.lexicon.model;

import se.lexicon.Enum.DrinkSize;

public class Drink extends Product {
    private String size;

    public Drink(double price, String productName, DrinkSize size) {
        super(price, productName);
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    private void setSize(DrinkSize size) {
        if (size == null ) throw new IllegalArgumentException("Drink size can't be set to null");
        this.size = size.getSize();
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
        sb.append("Drink{");
        sb.append("size='").append(size).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
