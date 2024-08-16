package com.gildedrose.items;

public class Item {
    protected String name;
    protected int sell;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sell = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void updateQuality() {
        if (quality > 0) {
            quality--;
        }
        sell--;
        if (sell < 0 && quality > 0) {
            quality--;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell + ", " + this.quality;
    }
}
