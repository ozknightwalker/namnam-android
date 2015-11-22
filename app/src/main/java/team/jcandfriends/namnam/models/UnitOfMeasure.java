package team.jcandfriends.namnam.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class UnitOfMeasure extends RealmObject {

    @PrimaryKey
    private int pk;
    private String name;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
