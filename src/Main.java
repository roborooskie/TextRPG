public class Main {
    public static void main(String[] args) {
        Player player = new Player("Rups",1);
        System.out.println(player.currentExp);

        Tool stok = new Tool("Stok","Kan je mee slaan", 50,1.5,100,2);
        stok.equipSlot = EquipsTo.LEFT_HAND;
        Tool stok2 = new Tool("Stok2","Kan je mee slaan", 50,1.5,100,2);
        stok2.equipSlot = EquipsTo.LEFT_HAND;
        Tool stok3 = new Tool("Stok3","Kan je mee slaan", 50,1.5,100,2);
        Tool stok4 = new Tool("Stok4","Kan je mee slaan", 50,1.5,100,2);
        Tool stok5 = new Tool("Stok5","Kan je mee slaan", 50,1.5,100,2);
        Tool stok6 = new Tool("Stok6","Kan je mee slaan", 50,1.5,100,2);
        stok3.equipSlot = EquipsTo.LEFT_HAND;
        Item cube = new Item();

        player.addItem(stok);
        player.addItem(stok2);
        player.addItem(stok3);
        player.addItem(stok4);
        player.addItem(stok5);
        player.addItem(stok6);
        player.addItem(cube);

        player.equipItem(stok);

        player.addItem(cube);

        player.displayEquippedItems();
        player.unEquipItem(EquipsTo.LEFT_HAND);
        player.displayEquippedItems();

    }
}