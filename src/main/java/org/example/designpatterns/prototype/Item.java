package org.example.designpatterns.prototype;

public abstract class Item implements Cloneable {

    private String itemName;
    private ItemType type;

    public String getItemName() {
        return itemName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
