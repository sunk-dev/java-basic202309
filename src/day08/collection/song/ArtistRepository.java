package day08.collection.song;

import java.util.HashMap;
import java.util.*;


public class ArtistRepository {
    //key:가수이름, value:가수 객체
    private  static Map<String, Artist> artistList;
    static {
        artistList=new HashMap<>();
    }

    //아티스트  명수 반환
    public int NumbersOfArtists(){
        return artistList.size();
    }

    public void enterTheSong(String singerName, String songName) {
        boolean isExistSinger=artistList.containsKey(singerName);
        if(isExistSinger){
            //기존에 등록되어있는 가수
            //1.노래가 등록 되어있는지 확인
            //2.등록 되어있지 않다면 추가 아니면 이미 등록된 노래라고 출력
            Set<String> songList = artistList.get(singerName).getSongList();
            boolean isExistSong=songList.contains(songName);
            if(isExistSong){
                System.out.printf("# [%s]곡은 이미 등록된 노래 입니다\n",songName);
            }else{
                songList.add(songName);
                System.out.printf("# %s님 노래 목록에 %s곡이 추가되었습니다.\n",singerName,songName);

            }

        }
        else{
            //신규 등록가수
            Set<String> songList=new HashSet<>(
                    Arrays.asList(songName));
            artistList.put(singerName,new Artist(singerName,songList));
            System.out.println("#"+singerName+"님이 신규 등록 되었습니다.");
        }

    }

    public void searchSinger(String singerName) {
        boolean isExistSinger=artistList.containsKey(singerName);
        if(isExistSinger){
            Artist artist=artistList.get(singerName);
            artist.info();
        }else{
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }

    }
}
