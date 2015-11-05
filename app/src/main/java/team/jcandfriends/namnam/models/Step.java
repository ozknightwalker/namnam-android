package team.jcandfriends.namnam.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Step extends RealmObject {

    @PrimaryKey
    private int pk;
    private int sequence;
    private String instruction;

}
