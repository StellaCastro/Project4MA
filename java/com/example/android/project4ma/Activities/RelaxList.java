package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.project4ma.Adapter.SongAdapter;
import com.example.android.project4ma.Model.Song;
import com.example.android.project4ma.R;

import java.util.ArrayList;

public class RelaxList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Song> musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("Feels Like Home","Chantal Kreviazuk",R.drawable.relax_album));
        musicLibrary.add(new Song("Forever","Chris Brown",R.drawable.relax_album));
        musicLibrary.add(new Song("Perfect","Ed Sheeran",R.drawable.relax_album));
        musicLibrary.add(new Song("I'll Be","Edwin Cain",R.drawable.relax_album));
        musicLibrary.add(new Song("A Thousand Year","Chrisina Perri",R.drawable.relax_album));
        musicLibrary.add(new Song("Thinking Out Loud","Ed Sheeran",R.drawable.relax_album));
        musicLibrary.add(new Song("Bibia Be Ye Ye","Ed Sheeran",R.drawable.relax_album));
        musicLibrary.add(new Song("Like Im Gonna Loose You","Megan Trainor",R.drawable.relax_album));
        musicLibrary.add(new Song("Dear Future Husband","Megan Trainor", R.drawable.relax_album));

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
        Intent get2Now = new Intent(RelaxList.this, NowPlaying.class);
        get2Now.putExtra("author", author);
        get2Now.putExtra("song",song);
        get2Now.putExtra("albump",album);
        startActivity(get2Now);
            }
        });

    }
}
