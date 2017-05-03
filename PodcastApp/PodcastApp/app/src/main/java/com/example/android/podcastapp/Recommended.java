package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Recommended extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);

        // Find the button that shows the player category
        TextView seePlayer = (TextView) findViewById(R.id.seePlayer);

        // Set a click listener on seePlayer
        seePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Player}
                Intent playerIntent = new Intent(Recommended.this, Player.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });
        TextView seeNewest = (TextView) findViewById(R.id.seeNewest);

        // Set a click listener on seeNewest
        seeNewest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link Newest}
                Intent newestIntent = new Intent(Recommended.this, Newest.class);

                // Start the new activity
                startActivity(newestIntent);
            }
        });
    }
}