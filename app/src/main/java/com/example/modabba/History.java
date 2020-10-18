package com.example.modabba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class History extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    HistoryViewpagerAdapter historyViewpagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        tabLayout =findViewById(R.id.tabs);
        viewPager =findViewById(R.id.viewpager1);

        tabLayout.addTab(tabLayout.newTab().setText("Veg"));
        tabLayout.addTab(tabLayout.newTab().setText("Non Veg"));
        tabLayout.setupWithViewPager(viewPager);
        //Toolbar toolbar =findViewById(R.id.toolbar);
        ImageButton arrowback=findViewById(R.id.arrowback);
        historyViewpagerAdapter = new HistoryViewpagerAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(historyViewpagerAdapter);

      arrowback.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent back=new Intent(getApplicationContext(),MainActivity.class);
              startActivity(back);
          }
      });

    }
}
