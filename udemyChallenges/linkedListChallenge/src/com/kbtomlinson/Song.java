package com.kbtomlinson;

public class Song {
    private String title;
    private int durationInSeconds;

    public Song(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    //override toString or write original method to print out both

    public void printSong(){
        System.out.println("Song Title: " + this.getTitle());
        System.out.println("Song Time:  " + this.getDurationInSeconds() + " seconds");

    }




}
