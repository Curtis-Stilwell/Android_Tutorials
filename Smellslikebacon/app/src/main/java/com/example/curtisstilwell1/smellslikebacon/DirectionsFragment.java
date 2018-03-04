package com.example.curtisstilwell1.smellslikebacon;

import android.util.Log;

/**
 * Created by curtisstilwell1 on 6/10/17.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
