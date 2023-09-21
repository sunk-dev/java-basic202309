package day07.exception;

public class LoginFailException extends Exception {
    //커스템 에러 클래스는
//    기본생성자와 에러메세지를 담는 생성자 구현

    public LoginFailException(String message) {
        super(message);
    }

    public LoginFailException() {
    }
}
