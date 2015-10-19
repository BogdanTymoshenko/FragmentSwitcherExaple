package ua.org.amicablesoft.myapplication.model;

/**
 * Created by bogdan on 10/20/15.
 */
public class Item {
    private String name;
    private String surName;

    public Item(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
