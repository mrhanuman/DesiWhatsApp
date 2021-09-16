package com.example.desiwhatsapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    TabLayout tb;
    ViewPager2 vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp2);
        vp.setAdapter(new FragmentAdapter(getSupportFragmentManager(), getLifecycle()));
        tb = findViewById(R.id.tablayout);
        TabLayoutMediator mediator = new TabLayoutMediator(
                tb, vp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
               switch (position){
                   case 0 : {
                       tab.setText("Chat");
                       break;
                   }
                   case 1 : {
                       tab.setText("Status");
                       break;
                   }
                   case 2 : {
                       tab.setText("Call");
                       break;
                   }
               }

            }
        }
        );
        mediator.attach();
    }
}