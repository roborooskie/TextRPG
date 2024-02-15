
public class Item {
    int value = 1;
    double weight = 0.5;
    double durability = 0.1;
    String name = "TestItem";
    String desc = "Just a regular item";
    EquipsTo equipSlot;
}
enum EquipsTo {
    HEAD,
    BODY,
    LEFT_HAND,
    RIGHT_HAND,
    FEET,
    EARRINGS,
    RING,
    NONE
}
class Tool extends Item {
    boolean isTwoHanded;
    int damage;
    int range;

    // Constructors  ===========================================================
    Tool(String name) {
        this.name = name;
    }
    Tool(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    Tool(String name, int damage, String desc) {
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, String desc, int damage, double weight) {
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, int damage, double weight) {
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, String desc, int damage, double weight, double durability) {
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, int damage, double weight, double durability) {
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, String desc, int damage, double weight, double durability, int range) {
        this.range = range;
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    Tool(String name, int damage, double weight, double durability, int range) {
        this.range = range;
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    // Methods ================================================================
}
    class equipment extends Item{
    int armorScore;
    }

