package Zadanie5;

public class Main {
    static void main() {
        CDAlbum album = new CDAlbum("Twoja stara", "Przy garach", 2);
        album.addTrack(0, 3);
        album.addTrack(1, 5);
        System.out.println(album);
    }
}
