package team.jcandfriends.namnam.models;


import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Recipe extends RealmObject {

    @PrimaryKey
    private int pk;
    private int reviews;
    private int defaultServingSize;
    private double rating;
    private double timeToComplete;
    private String name;
    private String description;
    private String banner;
    private String icon;
    private RealmList<RecipeComponent> recipeComponents;
    private RealmList<Step> steps;

}
