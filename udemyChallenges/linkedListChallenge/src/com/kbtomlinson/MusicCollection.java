package com.kbtomlinson;

import java.util.ArrayList;
import java.util.ListIterator;

public class MusicCollection {
    private String owner;
    private ArrayList<Album> albums;

    public MusicCollection(String owner) {
        this.owner = owner;
        this.albums = new ArrayList<Album>();
    }

    // add album to collection

    // list albums in collection
    // Add song to album
    public boolean addAlbumToCollection(String title, String artist){
        //verify if album exists already then add otherwise print error return false
        Album album = new Album(title, artist);
        this.albums.add(album);
        System.out.println(title + " successfully added");
        return true;
    }

    // add song to album in collection
    public boolean addSongToAlbum(String album, String song, int duration){
        // verify album exists already, find album, then add song to appropriate object.
        Album foundAlbum = getAlbum(album);
        foundAlbum.addSongToAlbum(song,duration);
        return true;
    }

    // list songs on album
    public boolean listSongsOnAlbum(String album){
        Album foundAlbum = getAlbum(album);
        foundAlbum.printList();
        return true;
    }

    // List albums in collection
    public void printList(){
        ListIterator<Album> i = albums.listIterator();
        System.out.println("List of Albums");
        System.out.println("---------- -- ----------");
        while(i.hasNext()){
            System.out.println("Album:  " + i.next().getTitle());
            System.out.println("Artist: " + i.previous().getArtist());
            i.next();
            if(i.hasNext()){
                System.out.println("-----");
            }
        }
        System.out.println("---------- -- ----------");
    }

    private Album getAlbum(String title){
        for(int i = 0; i < this.albums.size(); i++){
            Album checkedAlbum = this.albums.get(i);
            if (checkedAlbum.getTitle().equals(title)){
                return checkedAlbum;
            }
        }
        return null;
    }
}
