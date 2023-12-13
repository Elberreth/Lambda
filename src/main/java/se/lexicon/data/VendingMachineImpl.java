package se.lexicon.data;

import se.lexicon.Enum.AddMoney;
import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        setProducts(products);
        setDepositPool(0);
    }

    private void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        return depositPool;
    }

    private void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    @Override
    public void addCurrency(AddMoney amount) {
        if (amount == null) throw new IllegalArgumentException("Amount can't be set to null");
        setDepositPool(depositPool + amount.getAmount());
    }

    @Override
    public int getBalance() {
        return getDepositPool();
    }

    @Override
    public Product request(int id) {

        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        for ( Product prod : this.products ) {
            if (prod.getId() == id) {
                StringBuilder sb = new StringBuilder("Product Description:\n");
                sb.append(prod.getDescription());
                return sb.toString();
            }
        }
        return "Product not found";
    }

    @Override
    public String[] getProducts() {
        String[] products = new String[this.products.length];
        for (int i = 0; i < this.products.length; i++) {
            products[i] = this.products[i].getId() + "\n" + this.products[i].getProductName() + "\n" + this.products[i].getPrice();
        }
        return products;
    }
}
