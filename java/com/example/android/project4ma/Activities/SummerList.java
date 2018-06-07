package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.project4ma.Adapter.SongAdapter;
import com.example.android.project4ma.Model.Song;
import com.example.android.project4ma.R;

import java.util.ArrayList;

public class SummerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list);




        final ArrayList<Song> musicLibrary = new ArrayList<Song>();
        musicLibrary.add(new Song("La Gozadera", "Gente De Zona", R.drawable.summe_album));
        musicLibrary.add(new Song("Bailando", "Enrique Iglesias", R.drawable.summe_album));
        musicLibrary.add(new Song("Sugueme y Te Sigo", "Daddy Yankee", R.drawable.summe_album));
        musicLibrary.add(new Song("Limbo", "Daddy Yankee", R.drawable.summe_album));
        musicLibrary.add(new Song("Vivir Mi Vida", "Marc Antony", R.drawable.summe_album));
        musicLibrary.add(new Song("La Mordidita", "Ricky Martin", R.drawable.summe_album));
        musicLibrary.add(new Song("Que Viva la Vida", "Wisin", R.drawable.summe_album));
        musicLibrary.add(new Song("Moviendo Caderas", "Yandel", R.drawable.summe_album));
        musicLibrary.add(new Song("Danza Kuduro", "Don Omar", R.drawable.summe_album));

        final SongAdapter adapter = new SongAdapter(this, musicLibrary);
        final ListView musicListView = (ListView) findViewById(R.id.list_layout);
        musicListView.setAdapter(adapter);
        //this method will receive the song info and send it to nowPlaying activity
        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String author = musicLibrary.get(i).getmArtistName();
                String song = musicLibrary.get(i).getmNameSong();
                int album = musicLibrary.get(i).getmAlbumPic();
                Intent get2Now = new Intent(SummerList.this, NowPlaying.class);
                get2Now.putExtra("author", author);
                get2Now.putExtra("song", song);
                get2Now.putExtra("albump", album);
                startActivity(get2Now);
            }
        });




    }


}