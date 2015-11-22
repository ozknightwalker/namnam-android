package team.jcandfriends.namnam.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Ingredient extends RealmObject {

    @PrimaryKey
    private int pk;
    private String banner;
    private String icon;
    private String name;
    private String description;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
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
}
