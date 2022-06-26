package com.moudy.androidfinalexam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class login extends Fragment {

    // TODO:
    public login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_login2, container, false);
        Button btn =v.findViewById(R.id.loginbtn);
        EditText username,password;
        username =v.findViewById(R.id.username);
        password =v.findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("username",username.getText().toString());
                bundle.putString("password",password.getText().toString());
                FragmentManager fm =getActivity().getSupportFragmentManager();
                FragmentTransaction ft =fm.beginTransaction();
                dyfragment fragment1 =new dyfragment();
                fragment1.setArguments(bundle);

                ft.replace(R.id.container,fragment1);
                ft.addToBackStack(null);
                ft.commit();
               // getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new dyfragment()).addToBackStack(null).commit();

            }
        });
        return v;
    }
}