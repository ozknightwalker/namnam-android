package team.jcandfriends.namnam.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RecipeComponent extends RealmObject {

    @PrimaryKey
    private int pk;
    private int quantity;
    private String adjective;
    private String extra;
    private UnitOfMeasure unitOfMeasure;
    private Ingredient ingredient;

}
