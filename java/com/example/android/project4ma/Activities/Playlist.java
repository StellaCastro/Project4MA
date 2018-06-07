package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.project4ma.Adapter.SongAdapter;
import com.example.android.project4ma.Model.Song;
import com.example.android.project4ma.R;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_menu);

        final String userName;
        userName = getIntent().getExtras().getString("nameOfUser");
        TextView summerTextView = (TextView) findViewById(R.id.first_View);
        summerTextView.setText(userName + "'s Summer List");
        summerTextView.setBackgroundColor(getResources().getColor(R.color.pink1));
        summerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open Summer List", Toast.LENGTH_SHORT).show();
                Intent take2summerList = new Intent(Playlist.this, SummerList.class);
                startActivity(take2summerList);
            }
        });
        TextView relaxTextView = (TextView) findViewById(R.id.second_View);
        relaxTextView.setText(userName + "'s Relax List");
        relaxTextView.setBackgroundColor(getResources().getColor(R.color.pink2));
        relaxTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open Relax List", Toast.LENGTH_SHORT).show();
                Intent take2now = new Intent(Playlist.this, RelaxList.class);
                startActivity(take2now);
            }
        });

        TextView roadTextView = (TextView) findViewById(R.id.third_View);
        roadTextView.setText(userName + "'s RoadTrip List");
        roadTextView.setBackgroundColor(getResources().getColor(R.color.pink3));
        roadTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open RoadTrip List", Toast.LENGTH_SHORT).show();
                Intent take2road = new Intent(Playlist.this, RoaTripList.class);
                startActivity(take2road);
            }
        });

    }
}