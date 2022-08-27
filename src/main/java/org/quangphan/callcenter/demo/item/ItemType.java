package org.quangphan.callcenter.demo.item;

public enum ItemType {
    FOLDER("/"), PNG(".png"), JPEG(".jpg"), TEXT(".txt"), JAVA(".java");

    private String extension;

    ItemType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
