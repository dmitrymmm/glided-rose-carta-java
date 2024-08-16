package com.gildedrose.util;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePass;
import com.gildedrose.items.Item;
import com.gildedrose.items.Sulfuras;

public class ItemUtil {

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            default:
                return new Item(name, sellIn, quality);
        }
    }
}
