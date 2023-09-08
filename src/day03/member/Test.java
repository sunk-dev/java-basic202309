package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();
        mr.showMenbers();
        Member thief = new Member(4, "ddd@def.com", "9999", "밥도둑", Gender.MALE, 22);
        mr.addMember(thief);
        mr.showMenbers();

    }
}
