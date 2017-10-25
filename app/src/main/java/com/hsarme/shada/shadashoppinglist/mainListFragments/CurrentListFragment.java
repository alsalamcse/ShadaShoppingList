package com.hsarme.shada.shadashoppinglist.mainListFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.hsarme.shada.shadashoppinglist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentListFragment extends Fragment {
    private ImageButton imbSave;
    private TextView tvTotalValue, tvTotal, tvCount, tvCountValue;
    private ListView lstTvCurrent;


    public CurrentListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_current_list, container, false);
        tvTotal=(TextView)view.findViewById(R.id.tvTotal);
        tvTotalValue=(TextView)view.findViewById(R.id.tvTotalValue);
        tvCount=(TextView)view.findViewById(R.id.tvCount);
        tvCountValue=(TextView)view.findViewById(R.id.tvCountValue);
        imbSave=(ImageButton)view.findViewById(R.id.imBSave);
        lstTvCurrent=(ListView)view.findViewById(R.id.lstTvCurrent);

        String[] ar={"Noor","Rimaa","Teya","Muhammed","Shada"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, )


        return view;
    }

}
