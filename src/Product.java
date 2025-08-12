public abstract class Product implements Priceable {
    protected int productId;
    protected double price;

    public Product(int productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public abstract String getDetails();
}
