import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if(findSong(titleOfSong) != null) {
            return false;
        }

        Song newSong = new Song(titleOfSong, durationOfSong);
        songs.add(newSong);
        return true;
    }

    private Song findSong(String titleOfSong) {
        for(int i = 0; i < songs.size(); i++) {
            Song current = songs.get(i);
            if(current.getTitle() == titleOfSong) {
                return current;
            }
        }
        return null;
    }

    public boolean addToPlayList(int truckNumber, LinkedList<Song> playList) {
        if(truckNumber <= 0) {
            return false;
        }
        Song song = songs.get(truckNumber-1);
        playList.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if(song == null) {
            return false;
        }

        playList.add(song);
        return true;
    }
}
