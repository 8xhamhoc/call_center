package org.quangphan.callcenter.demo.item;

public class Folder extends Item {

    public Folder(String name) {
        super(name, ItemType.FOLDER);
    }

    @Override
    public void add(Item item) {
        getChildren().add(item);
        item.setParent(this);
    }
}
