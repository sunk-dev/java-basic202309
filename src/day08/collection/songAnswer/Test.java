package day08.collection.songAnswer;

public class Test {
    public static void main(String[] args) {
        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("에스파","GIRLS");
        ar.addNewArtist("에스파","SPICY");
        ar.addNewArtist("에스파","광야");

        System.out.println(ArtistRepository.getArtistList());
    }
}
