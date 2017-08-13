package com.timbuchalka;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */

public class Album {
    private String name;
    private String artist;
    private SongList songlist;
//    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songlist = createSongList();
    }

    private SongList createSongList(){
        // create an interface with the user allowing them to continue entering songs until they are done
        // instead in this interaction we will create an array to iterate over
        SongList songlist = new SongList();
        private String[] titles = new String[5];
//        {"I Am Mountain", "Let It Go", "Beat Of Her Heart","Long Way Off"};
        private int[] durations = new int[5]
//        {234,255,123,644,334};
        for( int i=0; i < 5; i++){
            songlist.addSong(titles[i],durations[i]);
        }
        return songlist;
    }

//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber -1;
//        if((index >0) && (index <= this.songs.size())) {
//            playList.add(this.songs.get(index));
//            return true;
//        }
//        System.out.println("This album does not have a track " + trackNumber);
//        return false;
//    }

//    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//        Song checkedSong = findSong(title);
//        if(checkedSong != null) {
//            playList.add(checkedSong);
//            return true;
//        }
//        System.out.println("The song " + title + " is not in this album");
//        return false;
//    }

    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.

    private class SongList {

        private ArrayList<Song> songs;

        public boolean addSong(String title, double duration) {
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

    }

}
