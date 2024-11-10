package com.gildedrose;

public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 30),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Regular_item_1", 5, 7),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
                new Item("Regular_item_2", 3, 6)
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
    }
}
