package com.drewandmick.drew.fortniteroulette;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class roulette extends AppCompatActivity {
    private TextView textView;
    private TextView Weapons;
    private TextView Looting;
    private TextView Meds;
    private TextView Resources;
    private TextView Strategy;
    private Random r;
    private Random s;
    private Random t;
    private Random u;
    private Random v;
    private Random x;
    private Integer i=0;
    private Integer j=0;
    private Integer w=0;
    private Integer l=0;
    private Integer y=0;
    private Integer re=0;
    private Integer m=0;
    public Integer number[];

    public static final String location="Location";
    public String choice;

    //coordinates
    private final String[] coord = {"A2","A3","A4","A5","A6","B1","B2","B3",
            "B4","B5","B6","B7","C1","C2","C3","C4","C5",
            "C6","C7","C8","D1","D2","D3","D4","D5","D6","D7",
            "D8","D9","D10","E2","E3","E4","E5","E6","E7","E8",
            "E9","E10","F2","F3","F4","F5","F6","F7","F8",
            "F9","F10","G2","G3","G4","G5","G6","G7","G8",
            "G9","G10","H2","H3","H4","H5","H6","H7","H8",
            "H9","I2","I3","I4","I5","I6","I7","I8", "I9",
            "J2","J3","J4","J5","J6","J7","J8","J9"};

    //places
    private final String[] items = {"Fatal Fields","Anarchy Acres","Dusty Depot","Haunted Hills",
            "Flush Factory","Greasy Grove","Retail Row","Moisty Mire","Shifty Shafts",
            "Pleasant Park","Salty Springs","Lucky Landing","Snobby Shores","Tilted Towers",
            "Junk Junction","Lonely Lodge","Loot Lake","Retail Row","Tomato Town","Wailing Woods"
    };

    //weapons
    private final String[] wea = {"No Shotguns"," No Assault Rifles","No Snipers","No Grenade/Rocket Launchers","No SMGs",
            "No Automatics","Only Shotguns","Only SMGs", "Only Silenced Weapons","Only Small Bullets", "Only Medium Bullets", "Only Handguns","No Gold Weapons","No Purple Weapons","No Blue Weapons",
            "No Green Weapons","Only Grey Weapons","Only Green Weapons"};

    //meds/shields
    private final String [] me = {"No Shields","No Bandages","No Med Kits","No Chug Jugs","Only Bandages","Only Small Shields","No Big Shields",
            "No Small Shields","No Healing","Only Campfires"};

    //building
    private final String [] res = {"No Wood","No Metal","No Stone","Only Wood","Only Metal","Only Stone","No Building At All", "No Port-A-Forts", "No Traps, Campfires or Launchpads"};

    private final String [] lo =  {"No Chests", "Only 1 Chest","Only 2 Chests", "No Looting Kills", "No Ammo Crates", "No Llamas",
    "Only Loot Found \n On The Floor", "No Vending Machines", "No Supply Drops"};

    private final String [] strat = {"No Reloading When In A Battle", "No Sprinting", "You Can't Shoot Somenone Unless They Shoot You First",
    "No Camping In Bases", "Only Hipfiring", "The Floor Is Lava", "You Have To Try To Kill Everyone You See", "No Going Inside Any Buildings", "No Jumping While In A Battle"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.MyAppTheme);
        setContentView(R.layout.activity_main);

        //Ads
        MobileAds.initialize(this, "ca-app-pub-8975309518326369~1188037678");
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setChecked(false);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button3);
        Button menu = findViewById(R.id.menu);
        textView = findViewById(R.id.textView);
        Looting = findViewById(R.id.Looting);
        Weapons = findViewById(R.id.Weapons);
        Meds = findViewById(R.id.Meds);
        Resources = findViewById(R.id.Resources);
        Strategy = findViewById(R.id.Strategy);
        number = new Integer[2000];


        r = new Random();
        s = new Random();
        t = new Random();
        u = new Random();
        v = new Random();
        x = new Random();

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu();
            }
        });

        //randomize
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (switch1.isChecked()){
                    number[j]=r.nextInt(coord.length);
                    textView.setText(coord[number[j]]);
                    choice=coord[number[j]];
                    j++;
                }
                else{
                    number[j]=r.nextInt(items.length);
                    textView.setText(items[number[j]]);
                    choice=items[number[j]];
                    if (choice=="Fatal Fields") ;
                    if (choice=="Anarchy Acres") ;
                    if (choice=="Dusty Depot") ;
                    if (choice=="Haunted Hills") ;
                    if (choice=="Flush Factory") ;
                    if (choice=="Greasy Grove") ;
                    if (choice=="Retail Row") ;
                    if (choice=="Moisty Mire") ;
                    if (choice=="Shifty Shafts") ;
                    if (choice=="Pleasant Park") ;
                    if (choice=="Salty Springs") ;
                    if (choice=="Lucky Landing") ;
                    if (choice=="Snobby Shores") ;
                    if (choice=="Tilted Towers");
                    if (choice=="Junk Junction") ;
                    if (choice=="Lonely Lodge") ;
                    if (choice=="Loot Lake") ;
                    if (choice=="Retail Row") ;
                    if (choice=="Tomato Town");
                    if (choice=="Wailing Woods") ;
                    j++;}



                if (w==1){
                    Weapons.setText(wea[s.nextInt(wea.length)]);
                }
                if (w==0){
                    Weapons.setText("-");
                }
                if (m==1){
                    Meds.setText(me[t.nextInt(me.length)]);
                }
                if (m==0){
                    Meds.setText("-");
                }
                if (re==1){
                    Resources.setText(res[u.nextInt(res.length)]);
                }
                if (re==0){
                    Resources.setText("-");
                }
                if (l==1){
                    Looting.setText(lo[v.nextInt(lo.length)]);
                }
                if (l==0){
                    Looting.setText("-");
                }
                if (y==1){
                    Strategy.setText(strat[x.nextInt(strat.length)]);
                }
                if (y==0){
                    Strategy.setText("-");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMapActivity();
            }
        });

    }

    //opening map
    public void openMapActivity(){
        Intent intent = new Intent(this, Map.class);
        if (choice=="Fatal Fields") intent.putExtra(location, 1);
        if (choice=="Anarchy Acres") intent.putExtra(location, 2);
        if (choice=="Dusty Depot") intent.putExtra(location, 3);
        if (choice=="Haunted Hills") intent.putExtra(location, 4);
        if (choice=="Flush Factory") intent.putExtra(location, 5);
        if (choice=="Greasy Grove") intent.putExtra(location, 6);
        if (choice=="Retail Row") intent.putExtra(location, 7);
        if (choice=="Moisty Mire") intent.putExtra(location, 8);
        if (choice=="Shifty Shafts") intent.putExtra(location, 9);
        if (choice=="Pleasant Park") intent.putExtra(location, 10);
        if (choice=="Salty Springs") intent.putExtra(location, 11);
        if (choice=="Lucky Landing") intent.putExtra(location, 12);
        if (choice=="Snobby Shores") intent.putExtra(location, 13);
        if (choice=="Tilted Towers") intent.putExtra(location, 14);
        if (choice=="Junk Junction") intent.putExtra(location, 15);
        if (choice=="Lonely Lodge") intent.putExtra(location, 16);
        if (choice=="Loot Lake") intent.putExtra(location, 17);
        if (choice=="Retail Row") intent.putExtra(location, 18);
        if (choice=="Tomato Town") intent.putExtra(location, 19);
        if (choice=="Wailing Woods") intent.putExtra(location, 20);
        if (choice=="A2") intent.putExtra(location, 21);
        if (choice=="A3") intent.putExtra(location, 22);
        if (choice=="A4") intent.putExtra(location, 23);
        if (choice=="A5") intent.putExtra(location, 24);
        if (choice=="A6") intent.putExtra(location, 25);
        if (choice=="B1") intent.putExtra(location, 26);
        if (choice=="B2") intent.putExtra(location, 27);
        if (choice=="B3") intent.putExtra(location, 28);
        if (choice=="B4") intent.putExtra(location, 29);
        if (choice=="B5") intent.putExtra(location, 30);
        if (choice=="B6") intent.putExtra(location, 31);
        if (choice=="B7") intent.putExtra(location, 32);
        if (choice=="C1") intent.putExtra(location, 34);
        if (choice=="C2") intent.putExtra(location, 35);
        if (choice=="C3") intent.putExtra(location, 36);
        if (choice=="C4") intent.putExtra(location, 37);
        if (choice=="C5") intent.putExtra(location, 38);
        if (choice=="C6") intent.putExtra(location, 39);
        if (choice=="C7") intent.putExtra(location, 40);
        if (choice=="C8") intent.putExtra(location, 41);
        if (choice=="D1") intent.putExtra(location, 42);
        if (choice=="D2") intent.putExtra(location, 43);
        if (choice=="D3") intent.putExtra(location, 44);
        if (choice=="D4") intent.putExtra(location, 45);
        if (choice=="D5") intent.putExtra(location, 46);
        if (choice=="D6") intent.putExtra(location, 47);
        if (choice=="D7") intent.putExtra(location, 48);
        if (choice=="D8") intent.putExtra(location, 49);
        if (choice=="D9") intent.putExtra(location, 50);
        if (choice=="D10") intent.putExtra(location, 51);
        if (choice=="E2") intent.putExtra(location, 52);
        if (choice=="E3") intent.putExtra(location, 53);
        if (choice=="E4") intent.putExtra(location, 54);
        if (choice=="E5") intent.putExtra(location, 55);
        if (choice=="E6") intent.putExtra(location, 56);
        if (choice=="E7") intent.putExtra(location, 57);
        if (choice=="E8") intent.putExtra(location, 58);
        if (choice=="E9") intent.putExtra(location, 59);
        if (choice=="E10") intent.putExtra(location, 60);
        if (choice=="F2") intent.putExtra(location, 61);
        if (choice=="F3") intent.putExtra(location, 62);
        if (choice=="F4") intent.putExtra(location, 63);
        if (choice=="F5") intent.putExtra(location, 64);
        if (choice=="F6") intent.putExtra(location, 65);
        if (choice=="F7") intent.putExtra(location, 66);
        if (choice=="F8") intent.putExtra(location, 67);
        if (choice=="F9") intent.putExtra(location, 68);
        if (choice=="F10") intent.putExtra(location, 69);
        if (choice=="G2") intent.putExtra(location, 70);
        if (choice=="G3") intent.putExtra(location, 71);
        if (choice=="G4") intent.putExtra(location, 72);
        if (choice=="G5") intent.putExtra(location, 73);
        if (choice=="G6") intent.putExtra(location, 74);
        if (choice=="G7") intent.putExtra(location, 75);
        if (choice=="G8") intent.putExtra(location, 76);
        if (choice=="G9") intent.putExtra(location, 77);
        if (choice=="G10") intent.putExtra(location, 78);
        if (choice=="H2") intent.putExtra(location, 79);
        if (choice=="H3") intent.putExtra(location, 80);
        if (choice=="H4") intent.putExtra(location, 81);
        if (choice=="H5") intent.putExtra(location, 82);
        if (choice=="H6") intent.putExtra(location, 83);
        if (choice=="H7") intent.putExtra(location, 84);
        if (choice=="H8") intent.putExtra(location, 85);
        if (choice=="H9") intent.putExtra(location, 86);
        if (choice=="I2") intent.putExtra(location, 87);
        if (choice=="I3") intent.putExtra(location, 88);
        if (choice=="I4") intent.putExtra(location, 89);
        if (choice=="I5") intent.putExtra(location, 90);
        if (choice=="I6") intent.putExtra(location, 91);
        if (choice=="I7") intent.putExtra(location, 92);
        if (choice=="I8") intent.putExtra(location, 93);
        if (choice=="I9") intent.putExtra(location, 94);
        if (choice=="J2") intent.putExtra(location, 95);
        if (choice=="J3") intent.putExtra(location, 96);
        if (choice=="J4") intent.putExtra(location, 97);
        if (choice=="J5") intent.putExtra(location, 98);
        if (choice=="J6") intent.putExtra(location, 99);
        if (choice=="J7") intent.putExtra(location, 100);
        if (choice=="J8") intent.putExtra(location, 101);
        if (choice=="J9") intent.putExtra(location, 102);
        startActivityForResult(intent,1);


    }

    //weapons checkbox
    public void weapons(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.weapons:
                if (checked)
                {
                    w=1;
                }
                else
                {
                    w=0;
                }
                break;

        }
    }

    //meds checkbox
    public void meds(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.meds:
                if (checked)
                {
                    m=1;
                }
                else
                {
                    m=0;
                }
                break;


        }
    }

    //resources checkbox
    public void resources(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.resources:
                if (checked)
                {
                    re=1;
                }
                else
                {
                    re=0;
                }
                break;


        }
    }

    //looting checkbox
    public void looting (View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.looting:
                if (checked)
                {
                    l=1;
                }
                else
                {
                    l=0;
                }
                break;

        }
    }

    //strategy checkbox
    public void strategy (View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.strategy:
                if (checked)
                {
                    y=1;
                }
                else
                {
                    y=0;
                }
                break;

        }
    }
    public void menu(){
        finish();
    }
}
