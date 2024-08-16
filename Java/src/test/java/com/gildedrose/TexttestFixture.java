package com.gildedrose;

import com.gildedrose.items.Item;
import com.gildedrose.util.ItemUtil;

import java.util.Arrays;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
            ItemUtil.createItem("+5 Dexterity Vest", 10, 20),
            ItemUtil.createItem("Aged Brie", 2, 0),
            ItemUtil.createItem("Elixir of the Mongoose", 5, 7),
            ItemUtil.createItem("Sulfuras, Hand of Ragnaros", 0, 80),
            ItemUtil.createItem("Sulfuras, Hand of Ragnaros", -1, 80),
            ItemUtil.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            ItemUtil.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            ItemUtil.createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            ItemUtil.createItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(Arrays.asList(items));

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
