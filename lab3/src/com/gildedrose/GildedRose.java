package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemCategory category = ItemCategory.categorize(item);
            switch (category) {
                case AGED_BRIE:
                    update_AgedBrie(item);
                    break;
                case BACKSTAGE_PASS:
                    update_BackstagePasses(item);
                    break;
                case SULFURAS:
                    item.quality = item.quality - 1;
                    break;
                case REGULAR:
                    update_RegularItem(item);
                    break;
            }

            update_SellIn(item);
            handle_ExpiredItem(item, category);
        }
    }

    private void handle_ExpiredItem(Item item, ItemCategory category) {
        if (item.sellIn < 0) {
            switch (category) {
                case AGED_BRIE:
                    if (item.quality < 50) {
                        item.quality++;
                    }
                    break;
                case BACKSTAGE_PASS:
                    item.quality = 0;
                    break;
                case REGULAR:
                    if (item.quality > 0) {
                        item.quality--;
                    }
                    break;
                case SULFURAS:
                    if (item.quality > 0) {
                        item.quality--;
                    }
                    break;
            }
        }
    }

//    private void handle_ExpiredItem(Item item) {
//        if (item.sellIn < 0) {
//            if (item.name.equals("Aged Brie")) {
//                if (item.quality < 50) {
//                    item.quality++;
//                }
//            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                item.quality = 0;
//            } else {
//                if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
//                    item.quality--;
//                }
//            }
//        }
//    }


    private void update_AgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void update_BackstagePasses(Item item) {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
    }

    private void update_RegularItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void update_SellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }

}
