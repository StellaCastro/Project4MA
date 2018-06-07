package com.example.android.project4ma.Model;

import java.io.Serializable;

public class Song implements Serializable {
    private String mNameSong;
    private String mArtistName;
    private int mAlbumPic;
    public Song (String nameSong, String artistName, int albumPic){
        mNameSong=nameSong;
        mArtistName=artistName;
        mAlbumPic=albumPic;
    }
    public String getmNameSong(){
        return mNameSong;
    }
    public String getmArtistName(){
        return mArtistName;
    }
    public int getmAlbumPic(){ return mAlbumPic; }
}


