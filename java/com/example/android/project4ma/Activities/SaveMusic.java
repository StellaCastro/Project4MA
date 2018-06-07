package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.project4ma.Adapter.SongAdapter;
import com.example.android.project4ma.Model.Song;
import com.example.android.project4ma.R;

import java.util.ArrayList;

public class SaveMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ArrayList<Song>musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("At Last","Cyndi Lauper",R.drawable.save_album));
        musicLibrary.add(new Song("Mi Princesa","David Bisbal",R.drawable.save_album));
        musicLibrary.add(new Song("Bendita Tu Luz","Mana",R.drawable.save_album));
        musicLibrary.add(new Song("Bajito","Jencarlos Canela",R.drawable.save_album));
        musicLibrary.add(new Song("I Like Me Better","Lauv",R.drawable.save_album));
        musicLibrary.add(new Song("Legendary Lover","Katy Perry",R.drawable.save_album));
        musicLibrary.add(new Song("You Belong To Me ","Taylor Swift",R.drawable.save_album));
        musicLibrary.add(new Song("Everything","Michael Buble",R.drawable.save_album));
        musicLibrary.add(new Song("Lucky","Jason Mraz",R.drawable.save_album));
        musicLibrary.add(new Song("I Dont Wanna Live Forever","Armo Krinzer",R.drawable.save_album));


        final SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView musicListView= (ListView)findViewById(R.id.list_layout);
        musicListView.setAdapter(adapter);
        //this method will receive the song info and send it to nowPlaying activity
        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String author = musicLibrary.get(i).getmArtistName();
                String song = musicLibrary.get(i).getmNameSong();
                int album = musicLibrary.get(i).getmAlbumPic();
                Intent get2Now = new Intent(SaveMusic.this, NowPlaying.class);
                get2Now.putExtra("author", author);
                get2Now.putExtra("song",song);
                get2Now.putExtra("albump",album);
                startActivity(get2Now);
            }
        });
    }

}
