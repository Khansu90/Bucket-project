package com.example.khansusbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListener ();

    }private void setupClickListener() {
        CardView thingsToDo = findViewById(R.id.card_view_things);
        CardView placesToGo = findViewById(R.id.card_view_places);

        thingsToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntentActivty = new Intent(MainActivity.this,ActivityThingsToDo.class);
                startActivity(myIntentActivty);

            }
        });

        placesToGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntentActivity = new Intent(MainActivity.this,ActivityPlacesToGo.class);
                startActivity(myIntentActivity);

            }
        });

    }


}
