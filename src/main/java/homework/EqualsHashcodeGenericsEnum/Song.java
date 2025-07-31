package homework.EqualsHashcodeGenericsEnum;
//4. Create a Song class with title, artist, and length fields. Implement the equals() method to check only the title and artist fields. Implement the hashCode() method to use the title and artist fields to calculate the hash code. Test that two instances with the same title and artist return true for equals() and have the same hash code.
import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private int lenght;

    public Song(String title, String artist, int lenght) {
        this.title = title;
        this.artist = artist;
        this.lenght = lenght;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if ( obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return title == song.title && artist == song.artist;
    }
    @Override
    public int hashCode(){
        return Objects.hash(title,artist);
    }

    public static void main(String[] args) {
        Song song1 = new Song("Song A", "Artist A", 200);
        Song song2 = new Song("Song A", "Artist A", 250);


        System.out.println("song1 equals song2: " + song1.equals(song2));

        System.out.println("song1 hashCode: " + song1.hashCode());
        System.out.println("song2 hashCode: " + song2.hashCode());

    }
}
