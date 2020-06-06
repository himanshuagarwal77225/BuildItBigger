package com.udacity.androiddisplayjokelib;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.udacity.androiddisplayjokelib.R;

public class JokeDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_details);
        String joke = getIntent().getStringExtra(EXTRA_JOKE);

        TextView jokeDetails = findViewById(R.id.text_joke_details);
        jokeDetails.setText(joke);
    }
}
