package org.quangphan.callcenter.demo.item;

public class Demo {

    public static void main(String[] args) {

        Folder working = new Folder("working");
        Java test = new Java("Test");
        Java test2 = new Java("Test2");
        Folder verypay = new Folder("verypay");
        working.add(verypay);

        working.add(test);
        working.add(test2);

        working.listChildren();

        verypay.add(test2);

        System.out.println("working path: " + working.getPath());
        System.out.println("test path: " + test.getPath());
        System.out.println("verypay path: " + verypay.getPath());
        System.out.println("test2 path: " + test2.getPath());
    }
}
