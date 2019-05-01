package com.example.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activitylstv extends AppCompatActivity {

    String[] myStringArray = new String[]{
            "Art House",
            "Bike Shop",
            "Camera Fix",
            "YETspace",
            "Secret Space Pad",
            "Taylor’s Tailor",
            "Boathouse",
            "Not Apple Store",
            "Tool Battleground",
            "Travelpediocity",
            "UFO Pick-a-part",
            "Spawrk’s House",
            "helll",
            "new list",
            "for scrolling"
    };

    private ListView latview;
    private ArrayAdapter arrayadp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_activitylstv);

        latview = (ListView)findViewById(R.id.lst11);
        arrayadp=new ArrayAdapter(this,android.R.layout.simple_list_item_1,myStringArray);
        if(latview!=null)
        {
            latview.setAdapter(arrayadp);
        }

        latview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("place",myStringArray[position]);
            }
        });

    /*    latview.setOnClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.v("PLACE",myStringArray[i]);

            }

        });*/

    }





}
