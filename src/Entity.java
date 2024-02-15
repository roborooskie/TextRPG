import java.util.Random;
// Entity Class ===========================================================
abstract public class Entity {
    String entityName = "Test Entity";
    int size;
    double weight;
    int currentHP = 5;
    int maxHP = 5;
    int distanceToPlayer;
    int abilityModifier = 1;
}

// Character Class ===========================================================
class Character extends Entity{
    final int[] xpRequirements = {0, 180, 360, 540, 720, 900, 1080, 1260, 1440, 1620, 1800, 1980, 2160, 2340, 2520, 2700};
    int level = 1;
    int currentExp = 0;
    int[] abilities = {5,5,5,5,5,5};
    int freeAbilityPoints = 0;
    boolean isAlive = true;
    int armorRating;
    Inventory inventory = new Inventory();

    Tool currentTool;
    // Constructors  ===========================================================

    Character(String name, int level, boolean def){
        entityName = name;
        this.level = level;
        if (def == true){
            setDefault(level);
        }

    }

    // Methods ================================================================

    void setDefault(int level){
        freeAbilityPoints = level * abilityModifier;
        int pass = 0;
        while (freeAbilityPoints > 0) {
            System.out.println("\n");
//            System.out.println("DEBUG freeAbilityPoints: " + freeAbilityPoints);
            Random rand = new Random();
            int randomNum;
            if (pass == 0 || pass == 1){
                randomNum = rand.nextInt(freeAbilityPoints/2);
                pass += 1;
//                System.out.println(" DEBUG pass is <2 so assigning");
            } else {
                randomNum = rand.nextInt(freeAbilityPoints + 1);
                pass += 1;
            }

//            System.out.println("DEBUG RANDOM NUM: " + randomNum);
            int lastIndex = 9;
            int randomIndex = rand.nextInt(6);
//            System.out.println("DEBUG randomIndex: " + randomIndex);

            if (randomIndex != lastIndex) {
                System.out.println("assigning " + randomNum);
                abilities[randomIndex] += randomNum;
                freeAbilityPoints -= randomNum;
                lastIndex = randomIndex;
            } else {
//                System.out.println("DEBUG: LastIndex: " +lastIndex + "\n CurrentIndex: " +randomIndex);
//                System.out.println("These are the same so new index is chosen...");
            }
            System.out.println("\n");
        }
    }
    //======================================================
    void gainExp(int xpGain){
        System.out.println("You gained "+xpGain+ "xp!");
        currentExp = currentExp+ xpGain;
        checkExp();
    }
    //======================================================
    void checkExp(){
//        System.out.println("DEBUG ran checkExp");
        int requiredXp = xpRequirements[level];
//        System.out.println("DEBUG requiredXp:" + requiredXp);
        if (currentExp >= requiredXp){
            currentExp -= requiredXp;
            levelUp();
            addAbilityPoints(1,abilityModifier);
        }
    }
    //======================================================
    void levelUp(){
        int requiredXp = xpRequirements[level];
        System.out.println(entityName + " has leveled up!");
        level += 1;
        maxHP += 2;
        currentHP = maxHP;
        currentExp -= requiredXp;
    }
    //======================================================
    void addAbilityPoints(int number, int modifier){
        freeAbilityPoints = freeAbilityPoints + number * modifier;
    }
    //======================================================
    void checkAbilityScore(){
        int str = abilities[0];
        int dex = abilities[1];
        int con = abilities[2];
        int inte = abilities[3];
        int wis = abilities[4];
        int cha = abilities[5];
        System.out.println(
                "Your current abilities are:\n"
                + str + " strength\n"
                + dex + " Dexterity\n"
                + con + " Constitution\n"
                + inte + " Intelligence\n"
                + wis + " Wisdom\n"
                + cha + " Charisma\n"
                + "And you have " + freeAbilityPoints + " points left to spend.");
    }
    //======================================================
    void changeAbility(String ability, int number){
        if (number <= freeAbilityPoints){
            int index = 0;
            ability = ability.toLowerCase();
            switch (ability) {
                case "str":
                    if (abilities[0] + number > 20){
                        index = 99;
                        break;
                    } else {
                        index = 0;
                        System.out.println(number + " points added to Strength.");
                        break;
                    }
                case "dex":
                    if (abilities[1] + number > 20){
                        index = 99;
                        break;
                    } else {
                        index = 1;
                        System.out.println(number + " points added to Dexterity.");
                        break;
                    }
                case "con":
                    if (abilities[2] + number > 20){
                        index = 99;
                        break;
                    } else {
                        System.out.println(number + " points added to Constitution.");
                        index = 2;
                        maxHP += number*3;
                        break;
                    }
                case "int":
                    if (abilities[3] + number > 20){
                        index = 99;
                        break;
                    } else {
                        System.out.println(number + " points added to Intelligence.");
                        index = 3;
                        break;
                    }
                case "wis":
                    if (abilities[4] + number > 20){
                        index = 99;
                        break;
                    } else {
                        System.out.println(number + " points added to Wisdom.");
                        index = 4;
                        break;
                    }
                case "cha":
                    if (abilities[5] + number > 20){
                        System.out.println("Can not raise ability past 20!");
                        index = 99;
                        break;
                    } else {
                        System.out.println(number + " points added to Charisma.");
                        index = 5;
                        break;
                    }
            }
            if (index == 99){
                System.out.println("Can not raise ability past 20!");
            } else {
                int originalValue = abilities[index];
                int updatedValue = originalValue + number;
                abilities[index] = updatedValue;
                freeAbilityPoints = freeAbilityPoints - number;
            }
        } else {
            System.out.println("Not enough free ability points!");
        }
    }

    void takeDamage(int damage){
        System.out.println(entityName + " took " + damage + " hit points of damage!");
        currentHP = currentHP - damage;
        if (currentHP < 0) {
            currentHP = 0;
            isAlive = false;
            System.out.println(entityName + " has succumbed to it's wounds and has died.");
        }
    }

    void gainHealth(int amount){
        if (isAlive){
            System.out.println(entityName + " has healed some hit points!");
            currentHP += amount;
            if (currentHP > maxHP){
                currentHP = maxHP;
                }
        } else {
            System.out.println(entityName +" is no longer alive and can not be healed.");
        }
    }
    void openInventory(){
        inventory.showInventory();
    }
    void addItem(Item item){
        inventory.addItem(item);
    }
    void removeItem(Item item){
        inventory.removeItem(item);
    }
}
class Player extends Character{
    EquipmentSlots equippedItems = new EquipmentSlots();

    Player(String name, int level) {
        // Call the superclass constructor with the provided arguments
        super(name, level, false);
        freeAbilityPoints = level * abilityModifier;
        maxHP += 2*level;
        currentHP = maxHP;
    }
    void equipItem(Item item) {
        equippedItems.equipItem(item,inventory);
    }
    void unEquipItem(EquipsTo slot){
        equippedItems.unEquipItem(slot,inventory);
    }
    public void displayEquippedItems() {
        equippedItems.displayEquippedItems();
    }
}
