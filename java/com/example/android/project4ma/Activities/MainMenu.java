package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.project4ma.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_menu);

        final String userName;
        userName=getIntent().getExtras().getString("name");
        TextView saveTextView = (TextView)findViewById(R.id.first_View);
        saveTextView.setText(userName+"'s Saved Music");
        saveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open Save Music", Toast.LENGTH_SHORT).show();
                Intent take2save = new Intent(MainMenu.this, SaveMusic.class);
                startActivity(take2save);
            }
        });
        TextView playlistTextView = (TextView)findViewById(R.id.second_View);
        playlistTextView.setText(userName+"'s Playlist");
        playlistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open Playlist", Toast.LENGTH_SHORT).show();
                Intent take2playlist = new Intent(MainMenu.this, Playlist.class);
                take2playlist.putExtra("nameOfUser",userName);
                startActivity(take2playlist);
            }
        });
        TextView searchTextView = (TextView)findViewById(R.id.third_View);
        searchTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open Search", Toast.LENGTH_SHORT).show();
                Intent take2search = new Intent(MainMenu.this, Search.class);
                startActivity(take2search);
            }
        });


    }



}
