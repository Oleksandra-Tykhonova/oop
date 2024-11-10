package com.gildedrose;

public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 20),
                new Item("Aged Brie", 1, 49),  // Almost max quality
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 30),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 45), // 10 days left
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),  // 5 days left
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20),  // concert day
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Regular item", 5, 7),
                new Item("Regular item", 0, 7), // No days to sell
                new Item("Regular item", 3, 0)  // 0 quality
        };

        GildedRose app = new GildedRose(items);

        System.out.println("Before inventorization:");
        for (Item item : items) {
            System.out.println(item);
        }

        app.update_Quality();

        System.out.println("\nAfter inventorization:");
        for (Item item : items) {
            System.out.println(item);
        }

        System.out.println("\nAfter additional day:");
        app.update_Quality();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
