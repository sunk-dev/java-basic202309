package day03.player;

public class Player {
    //field
    String nickName;
    int level;
    int hp;

    public Player() {
        this("이름없음");
        System.out.println("1번 생성자!");

    }

    public Player(String nickName) {
       this(nickName,1,50);
        System.out.println("2번 생성자!");

    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        System.out.println("3번 생성자!");
    }

    //method
    void attack(Player this,Player target){//어떤 플레이어를 때릴건지
        System.out.println("this = " + this);
        System.out.println("target = " + target);
        System.out.printf("%S님이 %s님을 공격했습니다.\n",this.nickName,target.nickName);


    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
