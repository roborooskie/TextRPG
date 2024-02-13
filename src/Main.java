public class Main {
    public static void main(String[] args) {
        Player player = new Player("Rups",1);
        System.out.println(player.currentExp);

        Tool stok = new Tool("Stok","Kan je mee slaan", 50,1.5,100,2);
        Item cube = new Item();

        player.addItem(stok);
        player.addItem(cube);
        player.openInventory();
        player.removeItem(stok);
        player.openInventory();
        player.addItem(stok);
        player.openInventory();
    }
}