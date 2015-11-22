package team.jcandfriends.namnam.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Stack;

import io.realm.RealmResults;
import team.jcandfriends.namnam.R;
import team.jcandfriends.namnam.models.Ingredient;

public class IngredientAdapter extends RealmRecyclerViewAdapter<Ingredient, IngredientAdapter.IngredientViewHolder> {

    public IngredientAdapter(Context context, RealmResults<Ingredient> realmResults) {
        super(context, realmResults);
    }


    @Override
    public IngredientViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(IngredientViewHolder holder, int position) {

    }

    public static class IngredientViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView description;

        public IngredientViewHolder(View itemView) {
            super(itemView);
            // FIXME: 11/9/15 Set actual IDs
            name = (TextView) itemView.findViewById(R.id.fab);
            description = (TextView) itemView.findViewById(R.id.action_settings);

            Stack stack;
        }
    }
}
