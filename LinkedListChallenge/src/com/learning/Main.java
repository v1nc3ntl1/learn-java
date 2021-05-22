package com.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add songs to playlist
        addSongs();

        // Added songs to playlist
        printOptions();
    }

    private static void printOptions() {
        if (playList.isEmpty()) {
            System.out.println("No songs found in the playlist.");
            return;
        }

        boolean quit = false;
        Song playingSong;

        System.out.println("Start playing song.");

        ListIterator<Song> playListIterator = playList.listIterator();
        playingSong = playListIterator.next();
        playingSong.playSong();

        boolean isforward = true;

        while (!quit) {
            showPrintOptions();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!isforward) {
                        if (playListIterator.hasNext()) {
                            playListIterator.next();
                        }
                        isforward = true;
                    }
                    if (playListIterator.hasNext()) {
                        playingSong = playListIterator.next();
                        playingSong.playSong();
                    } else {
                        System.out.println("Playlist has reached the end.");
                        isforward = false;
                    }
                    break;
                case 2:
                    if (isforward) {
                        if (playListIterator.hasPrevious()) {
                            playListIterator.previous();
                        }
                        isforward = false;
                    }
                    if (playListIterator.hasPrevious()) {
                        playingSong = playListIterator.previous();
                        playingSong.playSong();
                    } else {
                        System.out.println("Playlist has reached the beginning of the list.");
                        isforward = true;
                    }
                    break;
                case 3:
                    if (isforward) {
                        if (playListIterator.hasPrevious()) {
                            playingSong = playListIterator.previous();
                            playingSong.playSong();
                            isforward = false;
                        } else {
                            System.out.println("Playlist has reached the beginning of the list.");
                        }
                    } else {
                        if (playListIterator.hasNext()) {
                            playingSong = playListIterator.next();
                            playingSong.playSong();
                            isforward = true;
                        } else {
                            System.out.println("Playlist has reached the end.");
                        }
                    }
                    break;
                case 4:
                    showPlayList();
                    break;
                case 5:
                    playListIterator.remove();
                    break;
            }
        }
    }

    private static void showPlayList() {
        System.out.println("Showing all songs in the playlist.");
        ListIterator<Song> playListSongs = playList.listIterator();

        Song currentSong;
        while (playListSongs.hasNext()){
            currentSong = playListSongs.next();
            System.out.println("\t" + currentSong.getTitle() + " /t Duration: " + currentSong.getDuration() + " seconds.");
        }

        //for (int i = 0; i < playList.size(); i++) {
        //    System.out.println("\t" + playList.get(i).getTitle() + " /t Duration: " + playList.get(i).getDuration() + " seconds.");
        //}
    }

    private static void showPrintOptions() {
        System.out.println("Please choose options below: ");
        System.out.println("0 - Quit");
        System.out.println("1 - Skip forward to the next song");
        System.out.println("2 - Skip backward to the previous song");
        System.out.println("3 - Replay current song");
        System.out.println("4 - List all songs in the playlist");
        System.out.println("5 - Remove current song from playlist");
    }

    private static void addSongs() {
        boolean quit = false;

        while (!quit) {
            System.out.println("\n******************************************");
            System.out.println("Please choose options below: ");
            System.out.println("0 - Done adding album / songs");
            System.out.println("1 - Add Album");
            System.out.println("2 - Add Song");
            System.out.println("3 - Add Song to playlist");
            System.out.println("4 - Show all albums");

            int selectedOption = scanner.nextInt();
            scanner.nextLine();
            switch (selectedOption) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter album name");
                    String newAlbum = scanner.nextLine();
                    if (addAlbum(newAlbum)) {
                        System.out.println("Successfully add album " + newAlbum);
                    }
                    break;
                case 2:
                    System.out.println("Enter song name");
                    String songName = scanner.nextLine();
                    System.out.println("Enter song duration in seconds");
                    int duration = scanner.nextInt();
                    scanner.nextLine();

                    Album selectedAlbum = chooseAlbum();
                    selectedAlbum.addSong(songName, duration);
                    break;
                case 3:
                    System.out.println("Enter song name");
                    String song = scanner.nextLine();
                    addSongToPlayList(song);
                    break;
                case 4:
                    listAlbums();
                    break;
            }
        }
    }

    private static void addSongToPlayList(String songName) {
        Song song = findSongInAlbums(songName);
        if (song == null) {
            System.out.println("Could not find song " + songName + " in any album.");
            return;
        }
        if (playList.indexOf(song) >= 0){
            System.out.println("This song has been added to playlist.");
            return;
        }

        playList.add(song);
        System.out.println("Successfully added song " + songName);
    }

    private static Song findSongInAlbums(String songName) {
        Album currentAlbum;
        Song currentSong;

        for (int i = 0; i < albums.size(); i++) {
            currentAlbum = albums.get(i);
            currentSong = currentAlbum.searchSong(songName);
            if (currentSong != null) {
                return currentSong;
            }
        }

        return null;
    }

    private static Album chooseAlbum() {
        Album album;
        System.out.println("Choose which albums to add:");

        do {
            int i = 0;
            for (Album currentAlbum : albums) {
                System.out.println(i + " - Album '" + currentAlbum.getName() + "'");
                i++;
            }

            int chosenAlbum = scanner.nextInt();
            scanner.nextLine();
            album = findAlbum(chosenAlbum);

            if (album == null)
                System.out.println("Invalid option.");
            else
                return album;

        } while (true);
    }

    private static void listAlbums() {
        System.out.println("Listing all albums");

        Album currentAlbum;
        for (int i = 0; i < albums.size(); i++) {
            currentAlbum = albums.get(i);
            System.out.println("\tAlbum '" + currentAlbum.getName() + "'");
        }
    }

    private static boolean addAlbum(String albumName) {
        Album album = findAlbum(albumName);
        if (album != null) {
            System.out.println("Album " + albumName + " is already in file.");
            return false;
        }

        albums.add(new Album(albumName));
        return true;
    }

    private static Album findAlbum(int position) {
        if (position >= albums.size()) {
            return null;
        }
        return albums.get(position);
    }

    private static Album findAlbum(String albumName) {
        Album currentAlbum;
        for (int i = 0; i < albums.size(); i++) {
            currentAlbum = albums.get(i);
            if (currentAlbum.getName().equalsIgnoreCase(albumName)) {
                return currentAlbum;
            }
        }

        return null;
    }
}
