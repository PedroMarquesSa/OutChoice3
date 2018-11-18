package com.example.rodrigooliveira.outchoice;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rodrigooliveira.outchoice.Model.Wind;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WardrobeFragment extends Fragment {

    public WardrobeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View viewTemp = inflater.inflate(R.layout.fragment_wardrobe, container, false);
        // Inflate the layout for this fragment
        Window w =  getActivity().getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = viewTemp.findViewById(R.id.rv_list);
        List<item> mList =new ArrayList<>();
        mList.add(new item(R.drawable.pants, "Pants"));
        mList.add(new item(R.drawable.shoes, "Shoes"));
        mList.add(new item(R.drawable.jackets, "Jackets"));
        mList.add(new item(R.drawable.tshirts, "T-Shirts"));


        Adapter adapter = new Adapter(getActivity(), mList);
        if(recyclerView == null) {
            Log.d("otherotherTAg", "parei aqui");
        }
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return viewTemp;
    }
}
