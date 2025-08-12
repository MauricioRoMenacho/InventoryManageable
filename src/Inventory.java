import java.util.ArrayList;
import java.util.List;

/*
InventoryManageable

Métodos:
addItem(): Añadir un nuevo ítem al inventario.
deleteItem(): Eliminar un ítem del inventario.
listItems(): Listar todos los ítems del inventario.
findItemById(): Buscar un ítem por su ID
 */

public class Inventory implements InventoryManageable {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addItem(Product item) {
        products.add(item);
    }

    @Override
    public void deleteItem(int id) {
        boolean removed = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == id) {
                products.remove(i);
                removed = true;
                break; //rompo
            }
        }

        if (removed) {
            System.out.println("Producto con ID " + id + " eliminado \n");
        } else {
            System.out.println("No se encontró un producto con ID " + id);
        }
    }


    @Override
    public void listItems() {
        if (products.size() == 0) { // Si la lista está vacía
            System.out.println("Inventario vacío.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                Product producto = products.get(i);  //Usando desde el inicio para que siga cada vez el codigo en la lista
                System.out.println(producto.getDetails());
            }
        }
    }

    @Override
    public Product findItemById(int id) {
        for (int i = 0; i < products.size(); i++) {
            Product producto = products.get(i);
            if (producto.getProductId() == id) {
                return producto; //
            }
        }
        return null;
    }
}
