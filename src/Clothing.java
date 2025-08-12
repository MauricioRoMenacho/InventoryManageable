public class Clothing extends Product implements InventoryManageable {
    private int size;
    private String material;

    public Clothing(int productId, double price, int size, String material) {
        super(productId, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void addItem(Product item) {
        throw new UnsupportedOperationException("Un producto individual no maneja inventario.");
    }

    @Override
    public void deleteItem(int id) {
        throw new UnsupportedOperationException("Un producto individual no maneja inventario.");
    }

    @Override
    public void listItems() {
        throw new UnsupportedOperationException("Un producto individual no maneja inventario.");
    }

    @Override
    public Product findItemById(int id) {
        throw new UnsupportedOperationException("Un producto individual no maneja inventario.");
    }

    @Override
    public String getDetails() {
        return "Clothing [ID=" + productId + ", Price=" + price +
                ", Size=" + size + ", Material=" + material + "]";
    }
}
