package day03.member;

//책임(역할):회원을 여러명 저장 관리하는 클래스
public class MemberRepository {
    //필드 :회원 배열
    Member [] memberList;//가입된 회원배열
    Member[] removeMembers;//삭제된 회원 배열

    public MemberRepository() {
        this.memberList=new Member[]{
                new Member(1,"aaa@def.com","1234","콩벌레",Gender.MALE,15),
                new Member(2,"bbb@def.com","2345","팥죽이",Gender.FEMALE,35),
                new Member(3,"ccc@def.com","3456","카레맨",Gender.MALE,45),
        };
    }
    /*
    모든 회원정보를 출력하는 메서드

     */
    void showMenbers(){
        System.out.printf("==============현재회원정보 (총 %d명)===========\n",memberList.length);
        for (Member member : memberList) {
            System.out.println(member.inform());
        }
    }
    /**
     * 새로운 회원을 추가하는 메서드
     */
    boolean addMember(Member newMember){
        //push알고리즘
        Member[] temp= new Member[memberList.length+1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i]=memberList[i];

        }
        temp[temp.length-1]=newMember;
        memberList=temp;
        return true;

    }

    /**
     *이메일의 중복여부를 확인하는 메서드
     */
    /**
     * 이메일을 통해 특정회원 객체를 찾아서 반환하는 메서드
     */
    /**
     * 비밀번호를 수정하는 메서드
     */
    /**
     * 회원탈퇴를 처리하는 메서드
     */
}
