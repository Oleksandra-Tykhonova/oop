package com.gildedrose;

public enum ItemCategory {
    AGED_BRIE,
    BACKSTAGE_PASS,
    SULFURAS,
    REGULAR;

    public static ItemCategory categorize(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return AGED_BRIE;
            case "Backstage passes to a TAFKAL80ETC concert":
                return BACKSTAGE_PASS;
            case "Sulfuras, Hand of Ragnaros":
                return SULFURAS;
            default:
                return REGULAR;
        }
    }
}
