package team.jcandfriends.namnam.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;
import io.realm.RealmResults;

public abstract class RealmRecyclerViewAdapter<T extends RealmObject, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    /**
     * Constant that determines if the underlying RealmBaseAdapter will auto update its data
     */
    private static final boolean AUTOMATIC_UPDATE = true;

    /**
     * The wrapped RealmBaseAdapter that will be used to query the item count and to get the actual
     * element T.
     */
    private RealmBaseAdapter<T> mRealmBaseAdapter;

    public RealmRecyclerViewAdapter (Context context, RealmResults<T> realmResults) {
        mRealmBaseAdapter = new RealmModelAdapter<>(context, realmResults, AUTOMATIC_UPDATE);
    }

    public T getItem (int position) {
        return mRealmBaseAdapter.getItem(position);
    }

    @Override
    public int getItemCount() {
        return mRealmBaseAdapter == null ? 0 : mRealmBaseAdapter.getCount();
    }
}
