package com.hsarme.shada.shadashoppinglist.Data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hsarme.shada.shadashoppinglist.R;

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
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        //
        View view= LayoutInflater.from(getContext()).inflate(R.layout.product_item,parent,false);

        TextView itmTvName= (TextView)view.findViewById(R.id.itmTvName);
        TextView itmTvPrice= (TextView)view.findViewById(R.id.itmTvPrice);
        TextView itmTvAmount= (TextView)view.findViewById(R.id.itmTvAmount);
        ImageView itmImage= (ImageView)view.findViewById(R.id.itmImage);
        CheckBox itmChbIsCompleted= (CheckBox)view.findViewById(R.id.itmChbIsCompleted);

        Product p = getItem(position);
        itmTvName.setText(p.getName());
        itmTvPrice.setText(p.getPrice()+"");
        itmTvAmount.setText(p.getAmount()+"");
        itmChbIsCompleted.setChecked(p.isCompleted());

        return view;
    }
}
