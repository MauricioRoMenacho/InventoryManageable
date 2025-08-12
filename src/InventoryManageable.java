public interface InventoryManageable {
    void addItem(Product item);
    void deleteItem(int id);
    void listItems();
    Product findItemById(int id);
}

