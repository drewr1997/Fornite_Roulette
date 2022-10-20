package com.drewandmick.drew.fortniteroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;

public class Map extends AppCompatActivity {
    private InterstitialAd  mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.MyAppTheme);
        super.onCreate(savedInstanceState);

        //ads
        MobileAds.initialize(this, "ca-app-pub-8975309518326369~1188037678");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8975309518326369/5782926215");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        Intent intent = getIntent();
        int location = intent.getIntExtra(roulette.location, 0);
        switch (location) {
            case 0:
                setContentView(R.layout.map);
                Button button24 = findViewById(R.id.map1);
                button24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });                break;
            case 1:
                setContentView(R.layout.fatalfields);
                Button button4 = findViewById(R.id.fatal);
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 2:
                setContentView(R.layout.anarchyacres);
                Button button5 = findViewById(R.id.anarchy);
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 3:
                setContentView(R.layout.dustydepot);
                Button button6 = findViewById(R.id.dusty);
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 4:
                setContentView(R.layout.hauntedhills);
                Button button7 = findViewById(R.id.haunted);
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 5:
                setContentView(R.layout.flushfactory);
                Button button8 = findViewById(R.id.flush);
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 6:
                setContentView(R.layout.greasygrove);
                Button button9 = findViewById(R.id.greasy);
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 7:
                setContentView(R.layout.retailrow);
                Button button10 = findViewById(R.id.retail);
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 8:
                setContentView(R.layout.moistymire);
                Button button11 = findViewById(R.id.moisty);
                button11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 9:
                setContentView(R.layout.shiftyshafts);
                Button button12 = findViewById(R.id.shifty);
                button12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 10:
                setContentView(R.layout.pleasantpark);
                Button button13 = findViewById(R.id.pleasant);
                button13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 11:
                setContentView(R.layout.saltysprings);
                Button button14 = findViewById(R.id.salty);
                button14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 12:
                setContentView(R.layout.luckylanding);
                Button button15 = findViewById(R.id.lucky);
                button15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 13:
                setContentView(R.layout.snobyyshores);
                Button button16 = findViewById(R.id.snobby);
                button16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 14:
                setContentView(R.layout.tiltedtowers);
                Button button23 = findViewById(R.id.tilted);
                button23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });;
                break;
            case 15:
                setContentView(R.layout.junkjunction);
                Button button17 = findViewById(R.id.junk);
                button17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 16:
                setContentView(R.layout.lonelylodge);
                Button button18 = findViewById(R.id.lonely);
                button18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 17:
                setContentView(R.layout.lootlake);
                Button button19 = findViewById(R.id.loot);
                button19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 18:
                setContentView(R.layout.retailrow1);
                Button button20 = findViewById(R.id.retail1);
                button20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 19:
                setContentView(R.layout.tomatotown);
                Button button21 = findViewById(R.id.tomato);
                button21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 20:
                setContentView(R.layout.wailingwoods);
                Button button22 = findViewById(R.id.wailing);
                button22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 21:
                setContentView(R.layout.a2);
                Button button25 = findViewById(R.id.A2);
                button25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 22:
                setContentView(R.layout.a3);
                Button button26 = findViewById(R.id.A3);
                button26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 23:
                setContentView(R.layout.a4);
                Button button27 = findViewById(R.id.A4);
                button27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 24:
                setContentView(R.layout.a5);
                Button button28 = findViewById(R.id.A5);
                button28.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 25:
                setContentView(R.layout.a6);
                Button button29 = findViewById(R.id.A6);
                button29.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 26:
                setContentView(R.layout.b1);
                Button button30 = findViewById(R.id.B1);
                button30.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 27:
                setContentView(R.layout.b2);
                Button button31 = findViewById(R.id.B2);
                button31.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 28:
                setContentView(R.layout.b3);
                Button button32 = findViewById(R.id.B3);
                button32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 29:
                setContentView(R.layout.b4);
                Button button33 = findViewById(R.id.B4);
                button33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 30:
                setContentView(R.layout.b5);
                Button button34 = findViewById(R.id.B5);
                button34.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 31:
                setContentView(R.layout.b6);
                Button button35 = findViewById(R.id.B6);
                button35.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 32:
                setContentView(R.layout.b7);
                Button button36 = findViewById(R.id.B7);
                button36.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 34:
                setContentView(R.layout.c1);
                Button button37 = findViewById(R.id.C1);
                button37.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 35:
                setContentView(R.layout.c2);
                Button button38 = findViewById(R.id.C2);
                button38.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 36:
                setContentView(R.layout.c3);
                Button button39 = findViewById(R.id.C3);
                button39.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 37:
                setContentView(R.layout.c4);
                Button button40 = findViewById(R.id.C4);
                button40.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 38:
                setContentView(R.layout.c5);
                Button button41 = findViewById(R.id.C5);
                button41.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 39:
                setContentView(R.layout.c6);
                Button button42 = findViewById(R.id.C6);
                button42.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 40:
                setContentView(R.layout.c7);
                Button button43 = findViewById(R.id.C7);
                button43.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 41:
                setContentView(R.layout.c8);
                Button button44 = findViewById(R.id.C8);
                button44.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 42:
                setContentView(R.layout.d1);
                Button button45 = findViewById(R.id.D1);
                button45.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 43:
                setContentView(R.layout.d2);
                Button button46 = findViewById(R.id.D2);
                button46.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 44:
                setContentView(R.layout.d3);
                Button button47 = findViewById(R.id.D3);
                button47.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 45:
                setContentView(R.layout.d4);
                Button button48 = findViewById(R.id.D4);
                button48.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 46:
                setContentView(R.layout.d5);
                Button button49 = findViewById(R.id.D5);
                button49.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 47:
                setContentView(R.layout.d6);
                Button button50 = findViewById(R.id.D6);
                button50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 48:
                setContentView(R.layout.d7);
                Button button51 = findViewById(R.id.D7);
                button51.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 49:
                setContentView(R.layout.d8);
                Button button52 = findViewById(R.id.D8);
                button52.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 50:
                setContentView(R.layout.d9);
                Button button53 = findViewById(R.id.D9);
                button53.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 51:
                setContentView(R.layout.d10);
                Button button54 = findViewById(R.id.D10);
                button54.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 52:
                setContentView(R.layout.e2);
                Button button55 = findViewById(R.id.E2);
                button55.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 53:
                setContentView(R.layout.e3);
                Button button56 = findViewById(R.id.E3);
                button56.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 54:
                setContentView(R.layout.e4);
                Button button57 = findViewById(R.id.E4);
                button57.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 55:
                setContentView(R.layout.e5);
                Button button58 = findViewById(R.id.E5);
                button58.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 56:
                setContentView(R.layout.e6);
                Button button59 = findViewById(R.id.E6);
                button59.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 57:
                setContentView(R.layout.e7);
                Button button60 = findViewById(R.id.E7);
                button60.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 58:
                setContentView(R.layout.e8);
                Button button61 = findViewById(R.id.E8);
                button61.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 59:
                setContentView(R.layout.e9);
                Button button62 = findViewById(R.id.E9);
                button62.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 60:
                setContentView(R.layout.e10);
                Button button63 = findViewById(R.id.E10);
                button63.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 61:
                setContentView(R.layout.f2);
                Button button64 = findViewById(R.id.F2);
                button64.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 62:
                setContentView(R.layout.f3);
                Button button65 = findViewById(R.id.F3);
                button65.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 63:
                setContentView(R.layout.f4);
                Button button66 = findViewById(R.id.F4);
                button66.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 64:
                setContentView(R.layout.f5);
                Button button67 = findViewById(R.id.F5);
                button67.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 65:
                setContentView(R.layout.f6);
                Button button68 = findViewById(R.id.F6);
                button68.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 66:
                setContentView(R.layout.f7);
                Button button69 = findViewById(R.id.F7);
                button69.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 67:
                setContentView(R.layout.f8);
                Button button70 = findViewById(R.id.F8);
                button70.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 68:
                setContentView(R.layout.f9);
                Button button71 = findViewById(R.id.F9);
                button71.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 69:
                setContentView(R.layout.f10);
                Button button72 = findViewById(R.id.F10);
                button72.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 70:
                setContentView(R.layout.g2);
                Button button73 = findViewById(R.id.G2);
                button73.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 71:
                setContentView(R.layout.g3);
                Button button74 = findViewById(R.id.G3);
                button74.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 72:
                setContentView(R.layout.g4);
                Button button75 = findViewById(R.id.G4);
                button75.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 73:
                setContentView(R.layout.g5);
                Button button76 = findViewById(R.id.G5);
                button76.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 74:
                setContentView(R.layout.g6);
                Button button77 = findViewById(R.id.G6);
                button77.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 75:
                setContentView(R.layout.g7);
                Button button78 = findViewById(R.id.G7);
                button78.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 76:
                setContentView(R.layout.g8);
                Button button79 = findViewById(R.id.G8);
                button79.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 77:
                setContentView(R.layout.g9);
                Button button80 = findViewById(R.id.G9);
                button80.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 78:
                setContentView(R.layout.g10);
                Button button81 = findViewById(R.id.G10);
                button81.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 79:
                setContentView(R.layout.h2);
                Button button82 = findViewById(R.id.H2);
                button82.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 80:
                setContentView(R.layout.h3);
                Button button83 = findViewById(R.id.H3);
                button83.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 81:
                setContentView(R.layout.h4);
                Button button84 = findViewById(R.id.H4);
                button84.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 82:
                setContentView(R.layout.h5);
                Button button85 = findViewById(R.id.H5);
                button85.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 83:
                setContentView(R.layout.h6);
                Button button86 = findViewById(R.id.H6);
                button86.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 84:
                setContentView(R.layout.h7);
                Button button87 = findViewById(R.id.H7);
                button87.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 85:
                setContentView(R.layout.h8);
                Button button88 = findViewById(R.id.H8);
                button88.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 86:
                setContentView(R.layout.h9);
                Button button89 = findViewById(R.id.H9);
                button89.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 87:
                setContentView(R.layout.i2);
                Button button90 = findViewById(R.id.I2);
                button90.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 88:
                setContentView(R.layout.i3);
                Button button91 = findViewById(R.id.I3);
                button91.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 89:
                setContentView(R.layout.i4);
                Button button92 = findViewById(R.id.I4);
                button92.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 90:
                setContentView(R.layout.i5);
                Button button93 = findViewById(R.id.I5);
                button93.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 91:
                setContentView(R.layout.i6);
                Button button94 = findViewById(R.id.I6);
                button94.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 92:
                setContentView(R.layout.i7);
                Button button95 = findViewById(R.id.I7);
                button95.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 93:
                setContentView(R.layout.i8);
                Button button96 = findViewById(R.id.I8);
                button96.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 94:
                setContentView(R.layout.i9);
                Button button97 = findViewById(R.id.I9);
                button97.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 95:
                setContentView(R.layout.j2);
                Button button98 = findViewById(R.id.J2);
                button98.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 96:
                setContentView(R.layout.j3);
                Button button99 = findViewById(R.id.J3);
                button99.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 97:
                setContentView(R.layout.j4);
                Button button100 = findViewById(R.id.J4);
                button100.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 98:
                setContentView(R.layout.j5);
                Button button101 = findViewById(R.id.J5);
                button101.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 99:
                setContentView(R.layout.j6);
                Button button102 = findViewById(R.id.J6);
                button102.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 100:
                setContentView(R.layout.j7);
                Button button103 = findViewById(R.id.J7);
                button103.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 101:
                setContentView(R.layout.j8);
                Button button104 = findViewById(R.id.J8);
                button104.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;
            case 102:
                setContentView(R.layout.j9);
                Button button105 = findViewById(R.id.J9);
                button105.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        backtomainactivity();
                    }
                });
                break;

        }

    }

    public void backtomainactivity() {
        mInterstitialAd.show();
        finish();
    }
}
