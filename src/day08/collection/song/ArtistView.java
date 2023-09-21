package day08.collection.song;

import static util.Utility.input;

public class ArtistView {
    private static ArtistRepository ar;
    static {
        ar= new ArtistRepository();
    }

    public static void start() {
        runProcess();

    }

    private static void runProcess() {

        mainMenuView();

    }

    static void mainMenuView() {
        while (true){
            System.out.println("\n##### 음악 관리 프로그램 #####");
            System.out.println("#현재 등록된 가수: "+ar.NumbersOfArtists()+"명");
            System.out.println("* 1. 노래 등록하기");
            System.out.println("* 2. 노래 정보 검색");
            System.out.println("* 3. 프로그램 끝내기");
            System.out.println("=============================");
            String menuNumber = input(">>");

            switch (menuNumber){
                case "1":
                    System.out.println("# 노래 등록을 시작합니다");
                    String singerName = input("- 가수명:");
                    String songName = input("- 노래명:");
                    ar.enterTheSong(singerName,songName);
                    break;
                case "2":
                    System.out.println("# 검색할 가수명을 입력하세요");
                    singerName=input("- 가수명:");
                    ar.searchSinger(singerName);
                    break;
                case "3":
                    String isQuit=input("프로그램을 종료하시겠습니까? (y/n)").toUpperCase();
                    if(isQuit.equals("Y")){
                        System.out.println("프로그램을 종료합니다");
                        return;
                    }

                    break;




            }

        }

    }
}
