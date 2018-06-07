package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.android.project4ma.Adapter.SongAdapter;
import com.example.android.project4ma.Model.Song;
import com.example.android.project4ma.R;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ArrayList<Song> musicLibrary = new ArrayList<Song>();



        musicLibrary.add(new Song("Yo te Extrañare", "Tercer Cielo",  R.drawable.search_album));
        musicLibrary.add(new Song("Happy", "Alex Buye",  R.drawable.search_album));
        musicLibrary.add(new Song("Rude", "MAGIG!",  R.drawable.search_album));
        musicLibrary.add(new Song("Gorilla", "Bruno Mars",  R.drawable.search_album));
        musicLibrary.add(new Song("Cups Song", "Anna Kendrick",  R.drawable.search_album));
        musicLibrary.add(new Song("Lo Hecho Esta Hecho", "Shakira",  R.drawable.search_album));
        musicLibrary.add(new Song("Dark Horse", "Katy Perry",  R.drawable.search_album));
        musicLibrary.add(new Song("Lazy Song", "Bruno Mars",  R.drawable.search_album));
        musicLibrary.add(new Song("La Gozadera", "Gente De Zona",  R.drawable.search_album));
        musicLibrary.add(new Song("Bailando", "Enrique Iglesias",  R.drawable.search_album));
        musicLibrary.add(new Song("Sugueme y Te Sigo", "Daddy Yankee",  R.drawable.search_album));
        musicLibrary.add(new Song("Limbo", "Daddy Yankee",  R.drawable.search_album));
        musicLibrary.add(new Song("Vivir Mi Vida", "Marc Antony",  R.drawable.search_album));
        musicLibrary.add(new Song("La Mordidita", "Ricky Martin",  R.drawable.search_album));
        musicLibrary.add(new Song("Que Viva la Vida", "Wisin",  R.drawable.search_album));
        musicLibrary.add(new Song("Moviendo Caderas", "Yandel",  R.drawable.search_album));
        musicLibrary.add(new Song("Danza Kuduro", "Don Omar",  R.drawable.search_album));
        musicLibrary.add(new Song("Feels Like Home", "Chantal Kreviazuk",  R.drawable.search_album));
        musicLibrary.add(new Song("Forever", "Chris Brown",  R.drawable.search_album));
        musicLibrary.add(new Song("Perfect", "Ed Sheeran",  R.drawable.search_album));
        musicLibrary.add(new Song("I'll Be", "Edwin Cain",  R.drawable.search_album));
        musicLibrary.add(new Song("A Thousand Year", "Chrisina Perri",  R.drawable.search_album));
        musicLibrary.add(new Song("Thinking Out Loud", "Ed Sheeran",  R.drawable.search_album));
        musicLibrary.add(new Song("Bibia Be Ye Ye", "Ed Sheeran",  R.drawable.search_album));
        musicLibrary.add(new Song("Like Im Gonna Loose You", "Megan Trainor",  R.drawable.search_album));
        musicLibrary.add(new Song("Dear Future Husband", "Megan Trainor",  R.drawable.search_album));
        musicLibrary.add(new Song("Dura", "Daddy Yankee",  R.drawable.search_album));
        musicLibrary.add(new Song("Shape Of You", "Ed Sheraan",  R.drawable.search_album));
        musicLibrary.add(new Song("Fanatica Sensual", "Plan B",  R.drawable.search_album));
        musicLibrary.add(new Song("Felices los 4", "Maluma",  R.drawable.search_album));
        musicLibrary.add(new Song("Tenerife Sea", "Ed Sheraan",  R.drawable.search_album));
        musicLibrary.add(new Song("My House", "Flo Rida",  R.drawable.search_album));
        musicLibrary.add(new Song("Asi Es La Mujer", "Victor Manuel",  R.drawable.search_album));
        musicLibrary.add(new Song("Sk8er Boi", "Avril Lavigne",  R.drawable.search_album));
        musicLibrary.add(new Song("At Last", "Cyndi Lauper",  R.drawable.search_album));
        musicLibrary.add(new Song("Mi Princesa", "David Bisbal",  R.drawable.search_album));
        musicLibrary.add(new Song("Bendita Tu Luz", "Mana",  R.drawable.search_album));
        musicLibrary.add(new Song("Bajito", "Jencarlos Canela",  R.drawable.search_album));
        musicLibrary.add(new Song("I Like Me Better", "Lauv",  R.drawable.search_album));
        musicLibrary.add(new Song("Legendary Lover", "Katy Perry",  R.drawable.search_album));
        musicLibrary.add(new Song("You Belong To Me ", "Taylor Swift",  R.drawable.search_album));
        musicLibrary.add(new Song("Everything", "Michael Buble",  R.drawable.search_album));
        musicLibrary.add(new Song("Lucky", "Jason Mraz", R.drawable.search_album));
        musicLibrary.add(new Song("I Dont Wanna Live Forever", "Armo Krinzer",  R.drawable.search_album));
        final SongAdapter adapter = new SongAdapter(this, musicLibrary);
        ListView musicListView = (ListView) findViewById(R.id.list_layout);
        musicListView.setAdapter(adapter);


        //this method will receive the song info and send it to nowPlaying activity
        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String author = musicLibrary.get(i).getmArtistName();
                String song = musicLibrary.get(i).getmNameSong();
                int album = musicLibrary.get(i).getmAlbumPic();
                Intent get2Now = new Intent(Search.this, NowPlaying.class);
                get2Now.putExtra("author", author);
                get2Now.putExtra("song",song);
                get2Now.putExtra("albump",album);
                startActivity(get2Now);
            }
        });



    }







}
