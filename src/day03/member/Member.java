package day03.member;

import java.time.LocalDate;
//객체 지향의 중요원칙중하나는 단일 책임 원칙
//SRP:하나의 클래스는 하나의 책임만 가져라
// 회원설계도(회원 1명에 대한 정보 관리 책임)
// 회원설계도(회원 1명에 대한 정보 관리 책임)

//회원설계도
public class Member {
    int memberId;//회원식별번호
    String email;
    String password; //패스워드
    String memberName; //이름
    Gender gender;
    int age;//나이
    LocalDate regDate;//회원가입일
    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
        this.regDate = LocalDate.now();
    }

    //회원정보를 문자열로 만들어러 리턴
    String inform(){
        String convertGender=this.gender==Gender.MALE?"남성":"여성";
        return String.format("%d번 | %s | %s | %s | %d세"
                ,this.memberId,this.email,this.memberName,convertGender,this.age);
    }
    String personalInform(){
        String convertGender=this.gender==Gender.MALE?"남성":"여성";
        return String.format("|이름 :%s |\n|이메일: %s |\n |패스워드: %s |"
                ,this.memberName,this.email,this.password);
    }
}






