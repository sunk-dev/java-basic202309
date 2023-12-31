package day08.collection.songAnswer;

import java.util.*;


public class ArtistRepository {
    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    public static void setArtistList(Map<String, Artist> artistList) {
        ArtistRepository.artistList = artistList;
    }

    //key:가수이름, value:가수 객체
    private   static Map<String, Artist> artistList;
    static {
        artistList=new HashMap<>();
    }

    //신규가수를 map에 추가하는 기능
    public void addNewArtist(String artistName,String songName){
        //1.신규가수 정보를 생성
        Artist artist = new Artist(artistName, new HashSet<>());
        //2. 생성된 노래 목록에 전달 받은 노래 추가.
        artist.getSongList().add(songName);
        //3.가수 정보를 Map에 저장
        artistList.put(artistName,artist);

    }

    //현재 등록된 가수의 수 반환
    public int count() {
        return artistList.size();
    }

    // 가수명을 전달받아 현재 등록된 가수인지 확인하는 기능
    public  boolean isRegistered(String artistName){
        return artistList.containsKey(artistName);
    }

    /**
     * 기존 가수 정보에 노래만 추출하는 기능
     * @param artistName - 사용자의 입력가수
     * @param songName - 사용자의 입력 노래
     * @return - 곡이 중복되면 false, 곡이 정상적으로 추가되면 true
     */
    public boolean addNewSong(String artistName, String songName) {
        //1.맵에서 기존 가수 객체를 가져와야함.
        Artist artist= findArtistByName(artistName);
        boolean flag = artist.getSongList().add(songName);
        return flag;
        
    }

    private static Artist findArtistByName(String artistName) {
        return artistList.get(artistName);
    }
    //노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {
        Artist artist= findArtistByName(artistName);
        Set<String> songList = artist.getSongList();
       List<String> songs=new ArrayList<>(songList);
        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("* %d . %s",i+1,songs.get(i));

        }
    }
}
