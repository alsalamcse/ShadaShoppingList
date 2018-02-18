package com.hsarme.shada.shadashoppinglist.Data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by user on 14/12/2017.
 */

public class ProductAdapter extends ArrayAdapter<Product>
{

    /**
     *
     * @param context
     * @param resource the item xml file ex: R.layout.product_item
     */
    public ProductAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    /**
     * todo מספר סידורי של הנתון (עצם) ממקור הנתונים
     * @param position the index of one data item from the data source . statrting from zero
     * @param convertView
     * todo הממשק שיכטל להציג אוסף נתונים לדוגמה LISTVIEW
     * @param parent listView
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.producr_item,parent,false);
        return view;
    }
}
