package Week8;

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.amount;
    }

    public void increaseAmount(){
        this.amount++;
    }

    @Override
    public String toString() {
        return this.product + ": " +this.amount;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Purchase compared = (Purchase) object;

        if (!this.product.equals(compared.product)) {
            return false;
        }

        return this.price() == compared.price();
    }
}
