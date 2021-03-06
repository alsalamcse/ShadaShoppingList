package com.hsarme.shada.shadashoppinglist.mainListFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.hsarme.shada.shadashoppinglist.Data.Product;
import com.hsarme.shada.shadashoppinglist.Data.ProductAdapter;
import com.hsarme.shada.shadashoppinglist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentListFragment extends Fragment {
    private ImageButton imbSave;
    private TextView tvTotalValue, tvTotal, tvCount, tvCountValue;
    private ListView lstTvCurrent;

    //8.
    private ProductAdapter productAdapter;

    public CurrentListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //3.
        View view= inflater.inflate(R.layout.fragment_current_list, container, false);
        tvTotal=(TextView)view.findViewById(R.id.tvTotal);
        tvTotalValue=(TextView)view.findViewById(R.id.tvTotalValue);
        tvCount=(TextView)view.findViewById(R.id.tvCount);
        tvCountValue=(TextView)view.findViewById(R.id.tvCountValue);
        imbSave=(ImageButton)view.findViewById(R.id.imBSave);
        lstTvCurrent=(ListView)view.findViewById(R.id.lstTvCurrent);

        String[] ar={"Noor","Rimaa","Teya","Muhammed","Shada"};
      //  ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, )

        //9.todo בניית מתאם לרשימה
        productAdapter=new ProductAdapter(getContext(), R.layout.product_item);
        //10. todo קביעת המתאם לרשימה
        lstTvCurrent.setAdapter(productAdapter);

        readAndListen();

        return view;
    }

    // read and listen data from firebase
    private  void readAndListen(){
        //5. to get user email... user info
        FirebaseAuth auth=FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email=user.getEmail();
        email=email.replace('.','*');
        //6. building data reference = data path = data address
        DatabaseReference reference;
        //todo לקבלת קישור למסד הנתונים שלנו
        //todo  קישור הינו לשורש של המסד הנתונים
        reference= FirebaseDatabase.getInstance().getReference();
        //7. listening to data change
        reference.child(email).child("mylist")
                // todo בפעם הראשונה שמופעל המאזין מקבלים העתק לכל הניתונים תחת כתובת זו
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot)//todo העתק מהניתונים שהורדנו
                    {
                        //11. todo מחיקת כל הניתונים מהמתאם
                        productAdapter.clear();
                        for (DataSnapshot ds:dataSnapshot.getChildren()) {
                            Product p=ds.getValue(Product.class);
                            Log.d("SL",p.toString());
                            //12. todo הוספת עצם למתאם
                            productAdapter.add(p);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }

}
