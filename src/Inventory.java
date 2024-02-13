public class Inventory {
    int size = 5;
    Item[] inventory = new Item[size];

    // Methods ================================================================

    void showInventory() {
        int emptySlots = 0;
        boolean isEmpty = true;
        for (Item item : inventory) {
            if (item != null) {
                isEmpty = false;
                break;
            }
        }
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                emptySlots +=1;
            }
        }
        if (isEmpty){
            System.out.println("============================================");
            System.out.println("Your inventory is empty. You have 5 slots");
            System.out.println("============================================");
        } else {
            System.out.println("============================================");
            System.out.println("Your inventory contains the following items:");
            for (Item item : inventory) {
                if (item != null) {
                    System.out.println("-"+ item.name);
                }
            }
            System.out.println("you have "+ emptySlots+ " empty slots.");
            System.out.println("============================================");
        }
    }
    //======================================================
    void addItem(Item itemToAdd){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                // Add the item to the empty slot
                inventory[i] = itemToAdd;
                System.out.println("Added " + itemToAdd.name + " to the inventory.");
                return; // Exit the method after adding the item
            }
        }
        // If no empty slot is found
        System.out.println("Inventory is full. Cannot add " + itemToAdd.name + ".");
    }
    //======================================================
    void removeItem(Item itemToRemove){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].equals(itemToRemove)){
                inventory[i] = null;
            }
        }
    }
    boolean checkItem(Item item){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].equals(item)){
                return true;
            }
        }
        return false;  // Return false if the item is not found in the inventory
    }
}
