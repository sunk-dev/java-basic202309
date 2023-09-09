package day04.inherit;

//super class:sub class 들의 공통 필드와 메서드를 가진다.
public class Player {
    private String nickName; //부모가 프라이빗걸면 상속xx
    private int level;
    private int hp;
    public  Player(String nickName){
        this.nickName=nickName;
        this.level=1;
        this.hp=50;
    }


    public void attack(){
        System.out.println(nickName+"님이 공격합니다!");
    }
    public void status(){
        System.out.println("================캐릭터 정보================");
        System.out.println("닉네임 = " + nickName);
        System.out.println("레벨 = " + level);
        System.out.println("체력= " + hp);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
