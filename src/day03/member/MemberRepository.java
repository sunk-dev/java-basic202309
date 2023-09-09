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
                new Member(3,"ddd@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"eee@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"fff@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"ggg@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"hhh@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"iii@def.com","3456","카레맨",Gender.MALE,45),
                new Member(3,"jjj@def.com","3456","카레맨",Gender.MALE,45),

        };
        this.removeMembers=new Member[0];
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
    boolean addMember(Member newMember,String process){

        Member[] targetList=(process.equals("remove")?removeMembers:memberList);

        //push알고리즘
        Member[] temp= new Member[targetList.length+1];
        for (int i = 0; i < targetList.length; i++) {
            temp[i]=targetList[i];

        }
        temp[temp.length-1]=newMember;

        if(process.equals("remove")){
            removeMembers=temp;

        }
        else{
            memberList=temp;
        }


        return true;

    }

    /**
     *이메일의 중복여부를 확인하는 메서드
     * @param email- 중복검사 대상이메일
     * @return -중복이면 true 아니면 false
     */
    boolean isDupulicateEmail(String email){
        for (Member member : memberList) {
            if(member.email.equals(email))
                return true;

        }
        return false;
    }
    /**
     * 이메일을 통해 특정회원 객체를 찾아서 반환하는 메서드
     * 찾는 이메일이 없으면 null
     * @param email-탐색할 멤버객체의 이메일
     * @return -해당 이메일과 일치하는 회원의 모든 정보객체
     *          이메일이 일치하지 않으면 null
     * */
    Member findMemberByEmail(String email,String process){
        Member[] targetList=(process.equals("restore")?removeMembers:memberList);


        for (Member member : targetList) {
            if (email.equals(member.email))
                return member;
        }




        return null;
    }


    /**
     * 비밀번호를 수정하는 메서드
     */
   void updatePassword(String newPassword,String email){
       Member member=findMemberByEmail(email,"update");
       member.password=newPassword;

   }
    /**
     * 회원탈퇴를 처리하는 메서드
     */
    void deleteMember(String deleteEmail,String deletePassword){
        Member member=findMemberByEmail(deleteEmail,"delete");
        if(member.password.equals(deletePassword)){
            int index=findIndexByEmail(member.email,"delete");
            Member[] tempList=new Member[memberList.length-1];
            for (int i = 0; i <index ; i++) {
                tempList[i]=memberList[i];

            }
            for (int i =index ; i <tempList.length ; i++) {
                tempList[i]=memberList[i+1];

            }
            memberList=tempList;
            updateNewRemoveMember(member);
            System.out.println("삭제완료!");


        }
        else{
            System.out.println("비밀번호가 일치하지 않습니다!");
        }

    }

   void updateNewRemoveMember(Member removedMember) {
      addMember(removedMember,"remove");
       System.out.println("removedMember = " + removedMember.inform());

    }

    int findIndexByEmail(String targetEmail,String process){
        int NOT_FOUND=-1;
        Member[] targetList=(process.equals("restore")?removeMembers:memberList);

        for (int i = 0; i < targetList.length; i++) {
            if(targetList[i].email.equals(targetEmail)){
                return i;
            }

        }



        return NOT_FOUND;
    }

    boolean isOverTen(){
        if(memberList.length>=10)
            return true;
        return false;
    }

    void restoreMember(String email, String password) {
        Member member=findMemberByEmail(email,"restore");
        int restoreIndex=findIndexByEmail(email,"restore");
        if(member.password.equals(password)){
            System.out.println("member = " + member.password);
            addMember(member,"restore");
            System.out.println("복구되었습니다!");

        }else{

            System.out.println("비밀번호가 일치하지 않습니다!");

        }

    }
}
