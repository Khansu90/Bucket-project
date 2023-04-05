package com.example.khansusbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ActivityThingsToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView things = findViewById(R.id.recycler_view_things);

        Activities[] activity = {

                new Activities("Climb Mt.Kilimanjaro", "Do it the difficult way!", R.drawable.kilimanjaro, 5),
                new Activities("Experience the Northern Lights", "Somewhere in the Arctic Circle,probably Norway", R.drawable.northern_lights, 4.5f),
                new Activities("Road Trip across USA", "Hire a car from the West Coast and travel to the east coast", R.drawable.road_trip, 4.5f),
                new Activities("Scuba Dive", "In Koh Tao,Thailand", R.drawable.scubadive, 4),
                new Activities("Skydive", "Preferably over somewhere with an amazing view", R.drawable.kilimanjaro, 3.5f),
        };

        bucketListAdapter bucketListAdapter = new bucketListAdapter(activity);
        things.setAdapter(bucketListAdapter);

    }


}