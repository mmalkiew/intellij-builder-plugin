package com.mmalkiew.intellij.builder.view.components;

public enum BuilderComponentType {
    NOTATION_SET("NOTATION_SET"),
    NOTATION_WITH("NOTATION_WITH"),
    NOTATION_CUSTOM("NOTATION_CUSTOM");

    private String key;

    BuilderComponentType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
