package ObjectOriented.ItemManage;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item = new Item("Apple", 20);
        Item item2 = new Item("Sword", 2);

        inventory.addItem(item);
        inventory.addItem(item2);

        inventory.displayInventory();

    }
}
