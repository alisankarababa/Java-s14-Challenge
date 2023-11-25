package com.burger;

public enum eBreadRollType {
    DOUBLE_SANDWICH("Double Sandwich"),
    WRAP("Wrap"),
    SANDWICH("Sandwich");
    final private String name;
    eBreadRollType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
