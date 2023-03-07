// Write your code here

package com.example.song.repository;
import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    ArrayList<Song> getSongs();

    Song addSong(Song song);

    Song getSongById(int songId);

    Song updateSong(Song song, int songId);

    void deleteSong(int songId);
}