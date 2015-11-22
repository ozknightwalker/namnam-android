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

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getDefaultServingSize() {
        return defaultServingSize;
    }

    public void setDefaultServingSize(int defaultServingSize) {
        this.defaultServingSize = defaultServingSize;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(double timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public RealmList<RecipeComponent> getRecipeComponents() {
        return recipeComponents;
    }

    public void setRecipeComponents(RealmList<RecipeComponent> recipeComponents) {
        this.recipeComponents = recipeComponents;
    }

    public RealmList<Step> getSteps() {
        return steps;
    }

    public void setSteps(RealmList<Step> steps) {
        this.steps = steps;
    }
}
