package day08.collection.song;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Artist {
    private String name;
    private Set<String> songList;//노래목록

    public Artist(String name, Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    //가수정보 출력
    public void info(){
        System.out.println("# "+name+"님의 노래 목록");
        System.out.println("=========================");
        Iterator<String> iterSongList=songList.iterator();
        int songCount=1;
        while (iterSongList.hasNext()){
            System.out.printf("* %d. %s \n",songCount,iterSongList.next());
            songCount++;
        }

    }
}
