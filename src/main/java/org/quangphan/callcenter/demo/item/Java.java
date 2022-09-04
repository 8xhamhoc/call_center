package org.quangphan.callcenter.demo.item;

public class Java extends Item {

    public Java(String name) {
        super(name, ItemType.JAVA);
    }

    @Override
    public void add(Item item) {
        System.out.println("File cannot contains any items");
    }
}
