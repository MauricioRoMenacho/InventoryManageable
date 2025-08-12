public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Electronics e1 = new Electronics(1, 1200.0, "Samsung", "Galaxy S22");
        Electronics e2 = new Electronics(2, 2500.0, "Apple", "MacBook Air");

        Clothing c1 = new Clothing(3, 45.0, 38, "Algodón");
        Clothing c2 = new Clothing(4, 60.0, 40, "Poliéster");

        inventory.addItem(e1);
        inventory.addItem(e2);
        inventory.addItem(c1);
        inventory.addItem(c2);

        System.out.println("Listado de productos");
        inventory.listItems();

        System.out.println("\nCambiar precio por ID");
        Product p = inventory.findItemById(2);
        if (p != null) {
            p.setPrice(1100.0);
            System.out.println("Nuevo precio para ID 2: " + p.getPrice() );
        }

        System.out.println("\nEliminar producto");
        inventory.deleteItem(4);
        inventory.listItems();
    }
}
