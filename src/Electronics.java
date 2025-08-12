public class Electronics extends Product implements InventoryManageable {
    private String brand;
    private String model;

    public Electronics(int productId, double price, String brand, String model) {
        super(productId, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void addItem(Product item) {
    }

    @Override
    public void deleteItem(int id) {
    }

    @Override
    public void listItems() {
    }

    @Override
    public Product findItemById(int id) {
        return null;
    }

    @Override
    public String getDetails() {
        return "Electronics [ID=" + productId + ", Price=" + price +
                ", Brand=" + brand + ", Model=" + model + "]";
    }
}
