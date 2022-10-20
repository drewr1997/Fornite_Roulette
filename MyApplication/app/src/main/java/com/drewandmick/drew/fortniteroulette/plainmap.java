package com.drewandmick.drew.fortniteroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by Drew on 07/04/2018.
 */

public class plainmap extends AppCompatActivity{
        private InterstitialAd  mInterstitialAd;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setTheme(R.style.MyAppTheme);
            setContentView(R.layout.plainmap);
            super.onCreate(savedInstanceState);

            //Ads
            MobileAds.initialize(this, "ca-app-pub-8975309518326369~1188037678");
            AdView mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-8975309518326369/5009021704");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());


            Button button2 = findViewById(R.id.map1);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            backtomainactivity();
                        }
                    });
        }

    public void backtomainactivity(){
        mInterstitialAd.show();
                finish();
    }
}
