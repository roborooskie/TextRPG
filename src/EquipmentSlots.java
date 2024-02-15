public class EquipmentSlots {
    Item headSlot;
    Item bodySlot;
    Item leftHand;
    Item rightHand;
    Item feetSlot;
    Item earrings;
    Item ring;

    // Methods ================================================================

    void equipItem(Item item, Inventory inventory) {
        if (inventory.checkItem(item)) {
            EquipsTo slot = item.equipSlot;
            switch (slot) {
                case HEAD:
                    if (headSlot == null) {
                        headSlot = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = headSlot;
                        headSlot = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You equipped " + item.name + " on your head.");
                    break;
                case BODY:
                    if (bodySlot == null) {
                        bodySlot = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = bodySlot;
                        bodySlot = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You equipped " + item.name + " to your body..");
                    break;
                case LEFT_HAND:
                    if (leftHand == null) {
                        leftHand = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = leftHand;
                        leftHand = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You equipped " + item.name + " in your left hand.");
                    break;
                case RIGHT_HAND:
                    if (rightHand == null) {
                        rightHand = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = rightHand;
                        rightHand = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You equipped " + item.name + " in your right hand.");
                    break;
                case FEET:
                    if (feetSlot == null) {
                        feetSlot = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = feetSlot;
                        feetSlot = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You equipped " + item.name + " on your feet.");
                    break;
                case EARRINGS:
                    if (earrings == null) {
                        earrings = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = earrings;
                        earrings = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You put " + item.name + " on as earrings.");
                    break;
                case RING:
                    if (ring == null) {
                        ring = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = ring;
                        ring = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem,true);
                    }
                    System.out.println("You put " + item.name + " on your finger.");
                    break;
                case NONE:
                    System.out.println("This item cannot be equipped.");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + slot);
            }
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    void unEquipItem(EquipsTo slot, Inventory inventory) {
        Item removedItem;
        switch (slot) {
            case HEAD:
                if (headSlot == null) {
                    System.out.println("No item equipped to head.");
                } else if (inventory.checkEmpty()) {
                    removedItem = headSlot;
                    headSlot = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Head.");
                } else {
                    System.out.println("No inventory space available to un-equip " + headSlot.name + " to.");
                }
                break;
            case BODY:
                if (bodySlot == null) {
                    System.out.println("No item equipped to body.");
                } else if (inventory.checkEmpty()) {
                    removedItem = bodySlot;
                    bodySlot = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Body.");
                } else {
                    System.out.println("No inventory space available to un-equip " + bodySlot.name + " to.");
                }
                break;
            case LEFT_HAND:
                if (leftHand == null) {
                    System.out.println("No item equipped to left hand.");
                } else if (inventory.checkEmpty()) {
                    removedItem = leftHand;
                    leftHand = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Left Hand.");
                } else {
                    System.out.println("No inventory space available to un-equip " + leftHand.name + " to.");
                }
                break;
            case RIGHT_HAND:
                if (rightHand == null) {
                    System.out.println("No item equipped to right hand.");
                } else if (inventory.checkEmpty()) {
                    removedItem = rightHand;
                    rightHand = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Right Hand.");
                } else {
                    System.out.println("No inventory space available to un-equip " + rightHand.name + " to.");
                }
                break;
            case FEET:
                if (feetSlot == null) {
                    System.out.println("No item equipped to feet.");
                } else if (inventory.checkEmpty()) {
                    removedItem = feetSlot;
                    feetSlot = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Feet.");
                } else {
                    System.out.println("No inventory space available to un-equip " + feetSlot.name + " to.");
                }
                break;
            case EARRINGS:
                if (earrings == null) {
                    System.out.println("No item equipped as earrings.");
                } else if (inventory.checkEmpty()) {
                    removedItem = earrings;
                    earrings = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Earrings.");
                } else {
                    System.out.println("No inventory space available to un-equip " + earrings.name + " to.");
                }
                break;
            case RING:
                if (ring == null) {
                    System.out.println("No item equipped as ring.");
                } else if (inventory.checkEmpty()) {
                    removedItem = ring;
                    ring = null;
                    inventory.addItem(removedItem, true);
                    System.out.println("Unequipped " + removedItem.name + " from Ring.");
                } else {
                    System.out.println("No inventory space available to un-equip " + ring.name + " to.");
                }
                break;
            default:
                System.out.println("Invalid equipment slot.");
                break;
        }
    }
    public void displayEquippedItems() {
        System.out.println("============================================");
        System.out.println("Currently equipped items:");
        if (headSlot != null) System.out.println("Head: " + headSlot.name);
        else System.out.println("Head: [Empty]");

        if (bodySlot != null) System.out.println("Body: " + bodySlot.name);
        else System.out.println("Body: [Empty]");

        if (leftHand != null) System.out.println("Left Hand: " + leftHand.name);
        else System.out.println("Left Hand: [Empty]");

        if (rightHand != null) System.out.println("Right Hand: " + rightHand.name);
        else System.out.println("Right Hand: [Empty]");

        if (feetSlot != null) System.out.println("Feet: " + feetSlot.name);
        else System.out.println("Feet: [Empty]");

        if (earrings != null) System.out.println("Earrings: " + earrings.name);
        else System.out.println("Earrings: [Empty]");

        if (ring != null) System.out.println("Ring: " + ring.name);
        else System.out.println("Ring: [Empty]");
        System.out.println("============================================");
    }
}
