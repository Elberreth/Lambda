package se.lexicon.data;

import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products, int depositPool) {
        setProducts(products);
        setDepositPool(depositPool);
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
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalance() {
        return 0;
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
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
