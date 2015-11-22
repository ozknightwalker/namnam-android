package team.jcandfriends.namnam.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Step extends RealmObject {

    @PrimaryKey
    private int pk;
    private int sequence;
    private String instruction;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
