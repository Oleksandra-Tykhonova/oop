package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                update_AgedBrie(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                update_BackstagePasses(item);
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1;
            } else {
                update_RegularItem(item);
            }

            update_SellIn(item);
            handle_ExpiredItem(item);
        }
    }


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

    private void handle_ExpiredItem(Item item) {
        if (item.sellIn < 0) {
            if (item.name.equals("Aged Brie")) {
                if (item.quality < 50) {
                    item.quality++;
                }
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.quality = 0;
            } else {
                if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality--;
                }
            }
        }
    }


//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
}
