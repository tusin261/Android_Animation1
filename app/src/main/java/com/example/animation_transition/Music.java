package com.example.animation_transition;

public class Music {
    private int id;
    private String music_name;
    private String singer_name;
    private int avt;

    public Music(int id, String music_name, String singer_name, int avt) {
        this.id = id;
        this.music_name = music_name;
        this.singer_name = singer_name;
        this.avt = avt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }
}
