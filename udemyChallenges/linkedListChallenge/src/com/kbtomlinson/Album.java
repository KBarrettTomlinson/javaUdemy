package com.kbtomlinson;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String title;
    private String artist;
    private LinkedList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        //construct linked list as well
        this.songs = new LinkedList<Song>();
    }

    // Add song to album
    public boolean addSongToAlbum(String title, int duration){
        //verify if song exists already then add otherwise print error return false
        Song song = new Song(title, duration);
        this.songs.add(song);
        System.out.println(title + " successfully added to " + this.title);
        return true;
    }

    // List songs on album
    public void printList(){
        ListIterator<Song> i = songs.listIterator();
        System.out.println("Song list for " + this.title);
        System.out.println("---------- -- ----------");
        while(i.hasNext()){
            i.next().printSong();
            i.next();
            if(i.hasNext()){
                System.out.println("-----");
            }
        }
        System.out.println("---------- -- ----------");
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
