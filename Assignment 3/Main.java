package Option1;

public class Main {
    public static void main(String[] args) {
        FileInventoryPersistence filePersistence = new FileInventoryPersistence();
        InventoryManager inventoryManager = new InventoryManager(filePersistence);

        // Adding items to the inventory
        inventoryManager.addItem("Apple", 10);
        inventoryManager.addItem("Banana", 5);
        inventoryManager.addItem("Orange", 8);

        // Displaying the inventory
        inventoryManager.displayInventory();

        try {
            // Removing items from the inventory
            inventoryManager.removeItem("Banana", 2);
            inventoryManager.removeItem("Orange", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Displaying the inventory after removing items
        inventoryManager.displayInventory();

        // Saving the inventory to a file
        inventoryManager.saveInventoryToFile();
    }
}
