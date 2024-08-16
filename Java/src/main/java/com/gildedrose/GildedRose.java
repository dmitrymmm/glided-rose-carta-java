package com.gildedrose;

import com.gildedrose.items.Item;

import java.util.List;

public class GildedRose {
    private final List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }

    public List<Item> getItems() {
        return items;
    }
}

