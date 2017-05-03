package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Newest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newest);

        // Find the button that shows the player category
        TextView seePlayer = (TextView) findViewById(R.id.seePlayer);

        // Set a click listener on seePlayer
        seePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Player}
                Intent playerIntent = new Intent(Newest.this, Player.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });

        // Find the view that shows the recommended category
        TextView seeRecommended = (TextView) findViewById(R.id.seeRecommended);

        // Set a click listener on seeRecommended
        seeRecommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link recommended}
                Intent recommendedIntent = new Intent(Newest.this, Recommended.class);

                // Start the new activity
                startActivity(recommendedIntent);
            }
        });
    }
}
