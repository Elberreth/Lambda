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
        Product product = null;
        for ( Product prod : this.products ) {
            if (prod.getId() == id) {
                product = prod;
            }
        }
        if (product == null) {
            throw new IllegalStateException("Product does not exist");
        }
        if (product.getPrice() > getBalance()) {
            System.out.println("Not sufficient funds");
            return null;
        }
        this.depositPool = (int)(getBalance() - product.getPrice());
        System.out.println("You have purchased: " + product.getProductName() + " : " + product.getPrice() + ":-");

        return product;
    }

    @Override
    public int endSession() {
        if (getBalance() == 0) {
            System.out.println("Session ended");
            System.out.println("No deposited money to return");
            return 0;
        } else {
            int balance = getBalance();
            setDepositPool(0);
            System.out.println("Session ended");
            System.out.println("Returning " + balance + ":- to customer.");
            return balance;
        }
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
