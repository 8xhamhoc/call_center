package org.quangphan.callcenter.demo.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Item {

    private Metadata metadata = new Metadata();
    private List<Item> children;
    private Item parent;

    public Item(String name, ItemType type) {
        metadata.setName(name);
        metadata.setType(type);

        if (type != ItemType.FOLDER) {
            children = Collections.EMPTY_LIST;
        } else {
            children = new ArrayList<>();
        }
    }

    protected List<Item> getChildren() {
        return this.children;
    }

    private ItemType getType() {
        return this.metadata.getType();
    }

    protected void setParent(Item parent) {
        this.parent = parent;
    }

    public String getLocation() {
        if (parent != null) {
            return parent.getLocation() + "/" + getName();
        }
        return "/" + getName();
    }

    public String getName() {
        if (isFile()) {
            return metadata.getName() + metadata.getType().getExtension();
        }
        return metadata.getName();
    }

    protected boolean isFile() {
        return metadata.getType() != ItemType.FOLDER;
    }

    public void listChildren() {
        for (Item child : children) {
            System.out.println(child.getName());
        }
    }

    public void listAll() {
        for (int i = 0; i < children.size(); i++) {
            String prefix;
            if (i == children.size() - 1) {
                prefix = "\\- ";
            } else {
                prefix = "+- ";
            }
            if (isFile()) {
                System.out.println(prefix + children.get(i).getName());
            } else {
                System.out.println(prefix + children.get(i).getName());
                children.get(i).listAll();
            }
        }
    }

    public abstract void add(Item item);
}
