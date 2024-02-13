public class Equipment {
    Item headSlot;
    Item bodySlot;
    Item leftHand;
    Item rightHand;
    Item feetSlot;
    Item earrings;
    Item ring;

    enum EquipmentSlot {
        HEAD,
        BODY,
        LEFT_HAND,
        RIGHT_HAND,
        FEET,
        EARRINGS,
        RING
    }
    void equipItem(EquipmentSlot slot,Item item){
        switch (slot){
            case HEAD:
                if (headSlot == null){
                    headSlot = item;

            }
        }
    }
}
