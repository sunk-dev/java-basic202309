package day07.exception;

import util.Utility;

public class Main {
    public static void main(String[] args) {
        LoginUser usr = new LoginUser("abc123", "1234");
        String id = Utility.input("ID: ");
        String pw = Utility.input("PW: ");
        String result = null;
        try {
            result = usr.validate(id, pw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("result = " + result);


    }
}
