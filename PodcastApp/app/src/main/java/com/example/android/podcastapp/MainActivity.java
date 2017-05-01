package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the view that shows the recommended category
        TextView recommended = (TextView) findViewById(R.id.recommended);

        // Set a click listener on recommended
        recommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Recommended}
                Intent recommendedIntent = new Intent(MainActivity.this, Recommended.class);

                // Start the new activity
                startActivity(recommendedIntent);
            }
        });

        // Find the view that shows the newest category
        TextView newest = (TextView) findViewById(R.id.newest);

        // Set a click listener on newest
        newest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Newest}
                Intent newestIntent = new Intent(MainActivity.this, Newest.class);

                // Start the new activity
                startActivity(newestIntent);
            }
        });

        // Find the view that shows the player category
        TextView player = (TextView) findViewById(R.id.player);

        // Set a click listener on player
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Player}
                Intent playerIntent = new Intent(MainActivity.this, Player.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}
