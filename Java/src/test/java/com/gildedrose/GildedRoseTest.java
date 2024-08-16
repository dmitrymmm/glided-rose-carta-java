package com.gildedrose;

import com.gildedrose.items.Item;
import com.gildedrose.util.ItemUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[]{
            ItemUtil.createItem("fixme", 0, 0)
        };
        GildedRose app = new GildedRose(Arrays.asList(items));
        app.updateQuality();
        assertEquals("fixme", app.getItems().get(0).getName());
    }

}
