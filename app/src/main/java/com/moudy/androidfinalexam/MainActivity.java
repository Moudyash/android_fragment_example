package com.moudy.androidfinalexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

        btn.setOnLongClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.big));
            FragmentManager fm =getSupportFragmentManager();
            FragmentTransaction ft =fm.beginTransaction();
            dyfragment fragment1 =new dyfragment();
            ft.replace(R.id.container,fragment1);
            ft.addToBackStack(null);
            ft.commit();
        return true;
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new dyfragment()).addToBackStack(null).commit();

            }
        });
       // getSupportFragmentManager().beginTransaction().replace(R.id.container,new dyfragment()).addToBackStack(null).commit();
    }
}
