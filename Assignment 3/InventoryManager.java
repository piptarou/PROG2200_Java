package Option1;

import java.util.HashMap;
import java.util.Map;

// This class ONLY handles the inventory management operations (Single Responsibility)
// This class relies on the interface, but does not rely on FileInventoryPersistence (Dependency Inversion)
// FileInventoryPersistence handles the file saving operation
// The Overrides demonstrate adding functionality without modifying the base code in the interface (Open/Closed)

public class InventoryManager implements InventoryInterface {
    private Map<String, Integer> inventory;
    private FileInventoryPersistence filePersistence;

    public InventoryManager(FileInventoryPersistence filePersistence) {
        this.inventory = new HashMap<>();
        this.filePersistence = filePersistence;
    }

    @Override
    public void addItem(String item, int quantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }

    @Override
    public void removeItem(String item, int quantity) throws Exception {
        if (!inventory.containsKey(item) || inventory.get(item) < quantity) {
            throw new Exception("Item not available or insufficient quantity");
        }
        inventory.put(item, inventory.get(item) - quantity);
    }

    @Override
    public void displayInventory() {
        System.out.println("Inventory:");
        for (String item : inventory.keySet()) {
            System.out.println(item + ": " + inventory.get(item));
        }
    }

    public void saveInventoryToFile() {
        filePersistence.saveInventoryToFile(this);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
