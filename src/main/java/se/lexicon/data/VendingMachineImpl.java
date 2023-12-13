package se.lexicon.data;

import se.lexicon.Enum.AddMoney;
import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products;
    private int depositPool;
    private int[] validDepositAmounts = {
        1,2,5,10,20,50,100,200,500,1000
    };

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
    public void addCurrency(int amount) {
        for( int validatedAmount : validDepositAmounts ) {
            if (validatedAmount == amount) {
                setDepositPool(depositPool + amount);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid amount");
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
        String[] products = new String[this.products.length];
        for (int i = 0; i < this.products.length ; i++) {
            products[i] = this.products[i].getId() + "\n" + this.products[i].getProductName() + "\n" + this.products[i].getPrice();
        }
        return products;
    }
}
