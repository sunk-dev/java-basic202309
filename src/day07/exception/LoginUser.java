package day07.exception;

public class LoginUser {

    String userAccount;//사용자계정
    String userPassword;//사용자비밀번호

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    //로그인 검증 메서드

    public String validate(String inputAccount, String inputPw) throws LoginFailException {

            if (inputAccount.equals(userAccount)) {
                if (inputPw.equals(userPassword)) {
                    //로그인성동
                    return "SUCCESS";
                } else {
                    //pw불일치
                    throw new LoginFailException("비밀번호가 올바르지 않음!");

                }
            } else {
                throw new LoginFailException("가입된 계정이 아님!!");

            }
        }
}
