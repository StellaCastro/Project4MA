package com.example.android.project4ma.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.project4ma.R;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String song_name;
        String song_artist;
        int album_pic;
        int songNum;
        ImageView albumimage = (ImageView) findViewById(R.id.album_pic_now);
        album_pic = getIntent().getExtras().getInt("albump");
        albumimage.setImageResource(album_pic);
        TextView titleTextView = (TextView) findViewById(R.id.namea_and_artist);
        song_artist = getIntent().getExtras().getString("author");
        song_name = getIntent().getExtras().getString("song");
        titleTextView.setText(song_name + " by " + song_artist);


        ImageView prevImage = (ImageView)findViewById(R.id.back);
        prevImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Previous Song ", Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView playImage = (ImageView) findViewById(R.id.play);
        playImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Playing ", Toast.LENGTH_SHORT).show();

            }

        });
        ImageView nextImage = (ImageView)findViewById(R.id.next);
        nextImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Next Song", Toast.LENGTH_SHORT).show();
            }

        });
        ImageView shuffleImage = (ImageView)findViewById(R.id.shuffle);
        shuffleImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Shuffling Songs", Toast.LENGTH_SHORT).show();
            }

        });
        ImageView repeatImage = (ImageView)findViewById(R.id.repeat);
        repeatImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Repeating Song", Toast.LENGTH_SHORT).show();
            }

        });

    }


}
