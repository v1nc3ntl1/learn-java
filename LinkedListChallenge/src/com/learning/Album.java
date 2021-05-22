package com.learning;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public boolean addSong(String songName, int duration) {
        Song song = findSong(songName);
        if (song != null) {
            System.out.println("Unable to add song." + songName + " is already in the Album");
            return false;
        }

        songs.add(new Song(songName, duration));
        System.out.println("Successfully added song " + songName + " to Album " + this.name);
        return true;
    }

    public Song searchSong(String songName){
        return findSong(songName);
    }

    private Song findSong(String songName){
        Song currentSong;
        for (int i=0; i <songs.size(); i++){
            currentSong = songs.get(i);
            if (currentSong.getTitle().equalsIgnoreCase(songName)){
                return currentSong;
            }
        }

        return null;
    }
}
