package com.example.curtisstilwell1.smellslikebacon;

import android.util.Log;

/**
 * Created by curtisstilwell1 on 6/10/17.
 */

public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
