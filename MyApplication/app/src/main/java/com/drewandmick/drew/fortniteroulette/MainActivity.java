package com.drewandmick.drew.fortniteroulette;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    public int i = 0;
    public static final String location="Location";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        if (i == 0) {
            try {
                Thread.sleep(800);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        super.onCreate(savedInstanceState);
        setTheme(R.style.MyAppTheme);
        setContentView(R.layout.menu);

        //Ads
        MobileAds.initialize(this, "ca-app-pub-8975309518326369~1188037678");
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Button roulette = findViewById(R.id.roulette);
        Button map = findViewById(R.id.plainmap);
        Button vending = findViewById(R.id.vendingmap);

        roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roulette();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map();
            }
        });
        vending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vending();
            }
        });

    }

    public void roulette(){
        Intent intent = new Intent(this, roulette.class);
        startActivity(intent);
    }
    public void map(){
        Intent intent = new Intent(this, plainmap.class);
        startActivity(intent);
    }
    public void vending(){
        Intent intent = new Intent(this,vending.class);
        startActivity(intent);
    }
}

