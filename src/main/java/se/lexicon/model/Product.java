package se.lexicon.model;

import se.lexicon.sequencer.IdGenerator;

public abstract class Product {
    private static final IdGenerator generator = new IdGenerator();
    private int id;
    private double price;
    private String productName;
    private String description;

    public Product(double price, String productName, String description) {
        setId(generator.generateId());
        setPrice(price);
        setProductName(productName);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Price need to be set to a higher price than 0 kr");
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        if ((productName == null) || (productName.isEmpty()) ) throw new IllegalArgumentException("Product name can't be empty or set to null");
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        if ( (description == null) || (description.isEmpty()) ) {
            this.description = "*No description available for this product*";
            return;
        }
        this.description = description;
    }

    public abstract String examine();
    public abstract String use();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", productName='").append(productName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
