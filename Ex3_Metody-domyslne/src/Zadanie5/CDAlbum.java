package Zadanie5;

import java.util.Arrays;
import java.util.Objects;

public class CDAlbum {
    private String artistName;
    private String albumTitle;
    private int[] tracks;

    public CDAlbum(String artistName, String albumTitle, int songAmount) {
        setArtistName(artistName);
        setAlbumTitle(albumTitle);
        setTracks(songAmount);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public int[] getTracks() {
        return tracks;
    }

    public void setTracks(int songsAmount) {
        this.tracks = new int [songsAmount];
    }

    public void addTrack(int index, int length){
        this.tracks[index] = length;
    }

    public int totalLength(){
        int length = 0;
        for(int index = 0; index < this.tracks.length; index++){
            length += this.tracks[index];
        }
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CDAlbum cdAlbum)) return false;
        return Objects.equals(getArtistName(), cdAlbum.getArtistName()) && Objects.equals(getAlbumTitle(), cdAlbum.getAlbumTitle()) && Objects.deepEquals(getTracks(), cdAlbum.getTracks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArtistName(), getAlbumTitle(), Arrays.hashCode(getTracks()));
    }

    @Override
    public String toString() {
        return String.format("CDAlbum by %s : %s, Total length = %d minutes, Tracks Length: %s", this.artistName, this.albumTitle, this.totalLength(), Arrays.toString(this.tracks));
    }
}
