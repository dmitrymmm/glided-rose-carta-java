package com.gildedrose.items;

public class BackstagePass extends Item {

    public BackstagePass(int sell, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality++;
            if (sell < 11) {
                quality++;
            }
            if (sell < 6) {
                quality++;
            }
        }
        sell--;
        if (sell < 0) {
            quality = 0;
        }
    }
}
