package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
       return this.songList.addSong(title, duration);
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        Song song = this.songList.findSong(trackNumber);
        if (song != null){
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(String title, double duration){
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index >0) && (index < this.songs.size())) {
                return this.songs.get(index);
            }

            return null;
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
