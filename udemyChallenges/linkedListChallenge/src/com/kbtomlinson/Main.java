package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// Linked List Challenge

        // Create a program which implements a playlist for songs.

        // Create a Song class having Title and Duration for a song.

        // The program will have an Album class containing a list of songs.

        // The albums will be stored in an ArrayList

        // Songs from different albums can be added to the playlist and will appear in the list in the order they are added.

        // Once the songs have been added to the playlist, create a menu of options to:
            // Quit
            // Skip forward to next song
            // Skip backward to last song
            // Replay current song
            // List the songs in the playlist

        // A song must exist in an album before it can be added to the playlist

        Song song = new Song("I Am Mountain", 423);
        System.out.println(song.getDurationInSeconds());

        // Stretch - remove current song from the playlist
        Album iammountain = new Album("I Am Mountain", "Gungor");
        iammountain.addSongToAlbum("I Am Mountain", 423);
        iammountain.addSongToAlbum("Let It Go", 274);
        iammountain.printList();

        MusicCollection keithCollection = new MusicCollection("Keith");
        keithCollection.addAlbumToCollection("I Am Mountain", "Gungor");
        keithCollection.addAlbumToCollection("Aenima", "Tool");

        keithCollection.printList();
        keithCollection.addSongToAlbum("I Am Mountain", "She Walks Alone", 788);
        keithCollection.addSongToAlbum("I Am Mountain", "I Am Mountain", 323);
        keithCollection.addSongToAlbum("I Am Mountain", "Let It Go", 238);
        keithCollection.addSongToAlbum("I Am Mountain", "One Wild Life", 232);

        keithCollection.printList();
        keithCollection.listSongsOnAlbum("I Am Mountain");




    }
}
