package day08.collection.songAnswer;

import static util.Utility.input;
import static util.Utility.makeLine;

public class ArtistView {
    private static ArtistRepository ar;
    static {
        ar= new ArtistRepository();
    }

    // 메인 실행 기능
    public static  void start(){
        while (true){
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", ar.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();
            String menuNum=input(">>");


            switch (menuNum){
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");


            }
        }
    }
    //2번 메뉴에 대한 입출력메뉴
    private static void searchProcess() {
        System.out.println("# 검색할 가수명을 입력하세요");
        String artistName = input("- 가수명");
        if(ar.isRegistered(artistName)){
            System.out.printf("%s님의 노래목록",artistName);
            makeLine();
            ar.showSongList(artistName);

        }else{
            System.out.println("# 해당 가수는 등록되지 않았습니다!");
        }


    }

    //1번 메뉴에 대한 입출력 실행 배용
    private static void insertProcess() {
        System.out.println("# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명:");
        String songName = input("- 노래명:");
        //기존에 등록되지 않은 가수 일경우
        if(!ar.isRegistered(artistName)){
            ar.addNewArtist(artistName,songName);
            System.out.printf("# %s님이 신규 등록 되었습니다!\n",artistName);
        }else{
            //새로운 노래 정보만 추가하기
            //기존 가수 정보에서 새로운 노래 정보만 추가하면 됨.
            boolean flag = ar.addNewSong(artistName, songName);
            if(flag){
                System.out.printf("# %s님의 [%s]곡이 이미 등록 되어있습니다!\n",artistName,songName);
            }
            else{
                System.out.printf("# %s님의 [%s]곡이 추가되었습니다!\n",artistName);
            }
            
            
        }


    }


}
