package team.jcandfriends.namnam.models;

import io.realm.annotations.PrimaryKey;

public class Ingredient {

    @PrimaryKey
    private int pk;
    private String banner;
    private String icon;
    private String name;
    private String description;

}
