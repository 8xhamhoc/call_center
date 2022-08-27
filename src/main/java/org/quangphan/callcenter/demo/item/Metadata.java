package org.quangphan.callcenter.demo.item;

public class Metadata {

    private String name;
    private ItemType type = ItemType.FOLDER;
    private String location = "root";

    public Metadata() {
    }

    public Metadata(ItemType type) {
        this.type = type;
    }

    public Metadata(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
