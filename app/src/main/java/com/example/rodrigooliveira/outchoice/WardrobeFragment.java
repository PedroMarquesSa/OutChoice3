package com.example.rodrigooliveira.outchoice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hitomi.cmlibrary.CircleMenu;


/**
 * A simple {@link Fragment} subclass.
 */
public class WardrobeFragment extends Fragment {

    String arrayName [] = {"obtjeto 1","obtjeto 2","obtjeto 3"};


    public WardrobeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wardrobe, container, false);
    }

}
