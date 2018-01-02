package com.everestadvanced.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gallary extends Fragment {


    public Gallary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallary, container, false);

        //your code is here
        MainActivity mainActivity=new MainActivity();
        mainActivity.mainTxt.setText("");


        return view;
    }

}
