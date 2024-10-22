package Option1;

import java.util.Map;

// This interface can be implemented in another class other than the InventoryManager so the manager can be replaced
// and a new class can use the interface without breaking the code (Liskov)
// It contains methods ONLY for the inventory (Interface Segregation)
public interface InventoryInterface {
    void addItem(String item, int quantity);
    void removeItem(String item, int quantity) throws Exception;
    void displayInventory();

    // Map isn't fully utilized because the external file code isn't fully implemented
    Map<String, Integer> getInventory();
}
