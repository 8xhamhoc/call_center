package org.quangphan.callcenter.demo.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Item {

    private Metadata metadata = new Metadata();
    private List<Item> children;
    private Item parent;

    public Item(String name) {
        metadata.setName(name);

        if (metadata.getType() != ItemType.FOLDER) {
            children = Collections.EMPTY_LIST;
        } else {
            children = new ArrayList<>();
        }
    }

    public List<Item> getChildren() {
        return this.children;
    }

    public void setParent(Item parent) {
        this.parent = parent;
    }

    public abstract void add(Item item);

    public Metadata getMetadata() {
        return this.metadata;
    }

    public String getPath() {
        if (parent != null) {
            return parent.getPath() + "/" + getName();
        }
        return "/" + getName();
    }

    public String getName() {
        if (isFile()) {
            return metadata.getName() + metadata.getType().getExtension();
        }
        return metadata.getName();
    }

    public boolean isFile() {
        return metadata.getType() != ItemType.FOLDER;
    }

    public void listChildren() {
        for (Item child : children) {
            System.out.println(child.getName());
        }
    }
}
