package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public class ScrollView {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            followButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (u.Followed == true) {
                        u.Followed = false;
                        followButton.setText("Follow");
                    } else {
                        u.Followed = true;
                        followButton.setText("Unfollow");
                    }
                }
            });
        }
    }
}