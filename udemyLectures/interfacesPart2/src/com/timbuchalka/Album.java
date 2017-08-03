package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

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

    // Java libraries make extensive use of Interfaces


    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //LinkedList and List make use of the same interfaces so we can easily switch between them without breaking
    // any code

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



    // inheritance vs implimentation
    // consider the relationship to the final class to the object you are extending or implimenting
    // desk phone can telephone
    // mobile phone can telephone

    // you can only inherit from one superclass while you can impliment from multiple interfaces

    // a bird is an animal <--- inherits from
    // a dog is an animal
    // a bird can walk and fly <--- impliments
    // a dog can walk

















}
