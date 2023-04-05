package com.example.khansusbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ActivityPlacesToGo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);


        RecyclerView places = findViewById(R.id.recycler_view_places);


        Activities[] activity = {

                new Activities("Vietnam", "Con Dao islands,Hanoi,Halong Bay,Hoi An", R.drawable.vietnam, 4),
                new Activities("Kerala,India", "Try varied tea flavours,stay in houseboat,the fabulous food!", R.drawable.kerala, 4.5f),
                new Activities("Japan", "Hot springs,sushi,bamboo forest,bullet train through mountains", R.drawable.japan, 5),
                new Activities("Iceland", "Dynjandi waterfall,nature reserves,maybe the Northern Lights too!", R.drawable.iceland, 4.5f),
                new Activities("The Amazon,Brazil", "Try to survive being scared by all the creepy crawlies! ", R.drawable.amazon, 3),
        };

        bucketListAdapter bucketListAdapter = new bucketListAdapter(activity);
        places.setAdapter(bucketListAdapter);


    }

}