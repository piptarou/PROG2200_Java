package Option1;

// This handles saving the file which will make it easier to switch to a database for example (Single Responsibility)

public class FileInventoryPersistence {
    private static final String FILENAME = "inventory.txt";

    // Save inventory to a file (not implemented)
    public void saveInventoryToFile(InventoryInterface inventoryManager) {
        System.out.println("Saving inventory to " + FILENAME);
        // Code to save inventory to a file would go here
    }
}


