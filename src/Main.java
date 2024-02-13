public class Main {
    public static void main(String[] args) {

        Player player = new Player("Rups",3);
        tool tool1 = new tool("Stok",30,"Slaat hard.");
        player.inventory.addItem(tool1);
        player.openInventory();

        player.checkAbilityScore();

    }
}