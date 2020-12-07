package com.stl.letsmeet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.stl.letsmeet.ui.login.LoginActivity;

public class Likes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes);

        final Button NextButton = findViewById(R.id.NextButton);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Likes.this, Profile.class);
                startActivity(intent);
            }
        });

    }
}