/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here

package com.example.song.controller;
import com.example.song.model.Song;
import com.example.song.service.SongH2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 import java.util.*;

@RestController
 public class SongController{
    @Autowired
    private SongH2Service songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return  songService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return songService.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@RequestBody Song song,@PathVariable("songId") int songId){
        return songService.updateSong(song,songId);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }

 }