public class Equipment {
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
                        inventory.addItem(previousItem);
                    }
                    break;
                case BODY:
                    if (bodySlot == null) {
                        bodySlot = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = bodySlot;
                        bodySlot = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
                    break;
                case LEFT_HAND:
                    if (leftHand == null) {
                        leftHand = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = leftHand;
                        leftHand = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
                    break;
                case RIGHT_HAND:
                    if (rightHand == null) {
                        rightHand = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = rightHand;
                        rightHand = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
                    break;
                case FEET:
                    if (feetSlot == null) {
                        feetSlot = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = feetSlot;
                        feetSlot = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
                    break;
                case EARRINGS:
                    if (earrings == null) {
                        earrings = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = earrings;
                        earrings = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
                    break;
                case RING:
                    if (ring == null) {
                        ring = item;
                        inventory.removeItem(item);
                    } else {
                        Item previousItem = ring;
                        ring = item;
                        inventory.removeItem(item);
                        inventory.addItem(previousItem);
                    }
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
}
