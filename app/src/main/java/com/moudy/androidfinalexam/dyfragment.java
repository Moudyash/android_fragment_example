package com.moudy.androidfinalexam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class dyfragment extends Fragment {

String pass,user;
    public dyfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_dyfragment, container, false);
Bundle bundle=getArguments();
        TextView txt =v.findViewById(R.id.tv);
        if (bundle!= null){
            pass=bundle.getString("username").toString();
                    user=bundle.getString("password").toString();
        }
        txt.setText("Username:"+pass+"\n password:"+user);

        return v;
    }
}