package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();

        mr.deleteMember("abc@def.com");
        mr.showMembers();
        mr.printRemoveMembers();


    }
}
