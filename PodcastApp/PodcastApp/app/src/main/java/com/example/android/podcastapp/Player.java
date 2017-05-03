package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // Find the view that shows the recommended category
        TextView seeRecommended = (TextView) findViewById(R.id.seeRecommended);

        // Set a click listener on seeRecommended
        seeRecommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link recommended}
                Intent recommendedIntent = new Intent(Player.this, Recommended.class);

                // Start the new activity
                startActivity(recommendedIntent);
            }
        });

        // Find the view that shows the newest category
        TextView seeNewest = (TextView) findViewById(R.id.seeNewest);

        // Set a click listener on seeNewest
        seeNewest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Newest}
                Intent newestIntent = new Intent(Player.this, Newest.class);

                // Start the new activity
                startActivity(newestIntent);
            }
        });
    }
}
