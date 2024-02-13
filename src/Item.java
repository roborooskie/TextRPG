
abstract public class Item {
    double weight = 0.5;
    double durability = 0.1;
    String name = "TestItem";
    String desc = "Just a regular item";
}
class tool extends Item {
    boolean isTwoHanded;
    int damage;
    int range;

    // Constructors  ===========================================================
    tool(String name) {
        this.name = name;
    }
    tool(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    tool(String name, int damage, String desc) {
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, String desc, int damage, double weight) {
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, int damage, double weight) {
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, int damage, String desc, double weight, double durability) {
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, int damage, double weight, double durability) {
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, int damage, String desc, double weight, double durability, int range) {
        this.range = range;
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    tool(String name, int damage, double weight, double durability, int range) {
        this.range = range;
        this.durability = durability;
        this.weight = weight;
        this.desc = desc;
        this.name = name;
        this.damage = damage;
    }
    // Methods ================================================================
}


