package book;

import day03.member.Gender;

import java.util.Locale;
import java.util.Scanner;

import static book.LibraryRepository.*;
import static book.RentStatus.*;



public class LibraryView {
    static Scanner sc = new Scanner(System.in);
    private static LibraryRepository repository;
    static Book[] books = getBookList();
    static final String searchByTitle = "byTitle";
    static final String searchByAuthor = "byAuthor";


    public static BookUser usr;

    public static void start() {
        loginPersonalInfo();
    }

    public static void loginPersonalInfo() {
        System.out.println("# 회원 정보를 입력해주세요");
        String name = input("#이름:");
        int age = Integer.parseInt(input("#나이:"));
        Gender gender = checkCorrectGenderInput();
        usr = new BookUser(name, age, gender, 0);
        showLibraryMenu();
    }

    private static void showLibraryMenu() {
        while (true) {
            System.out.println("=========== 도서 메뉴 =============");
            System.out.println("# 1. 마이페이지");
            System.out.println("# 2. 도서전체조회");
            System.out.println("# 3. 도서 제목으로 검색");
            System.out.println("# 4. 도서 대여하기");
            System.out.println("# 5. 도서 저자이름으로 검색");//좀있다
            System.out.println("# 9. 프로그램종료");
            String menuNumber = input("- 메뉴번호: ");

            switch (menuNumber) {
                case "1":
                    showPersonalInfo();
                    break;
                case "2":
                    showAllBooks();
                    break;
                case "3":
                    searchBooks("byTitle");
                    break;
                case "4":
                    rentBook();
                    break;
                case "5":
                    searchBooks("byAuthor");
                    break;
                case "9":
                    String answer = input("# 종료하시겠습니까? (y/n)").toUpperCase();
                    if (answer.equals("Y")) {
                        System.out.println("# 시스템을 종료합니다");
                        return;
                    }

            }
        }
    }

    /**
     * checkCorrectGenderInput()
     * 성별 Gender 타입으로 변환해서 반환
     *
     * @return Gender
     */

    private static Gender checkCorrectGenderInput() {
        while (true) {
            String inputGender = input("# 성별 [M/F]: ");
            switch (inputGender.toUpperCase()) {
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M또는 F로 입력하세요!");
            }
        }
    }

    /**
     * 1번:showPersonalInfo
     * 입력 받은 회원정보를 출력하는 함수
     */
    private static void showPersonalInfo() {
        System.out.println("*********  회원님 정보 **********");
        System.out.println("#회원명: " + usr.getName());
        System.out.println("#나이: " + usr.getGenderToString());
        System.out.println("#성별:  " + usr.getAge());
        System.out.println("#쿠폰 개수: " + usr.getCouponCount());
    }

    /**
     * 2번
     * showAllBooks()
     * 모든 도서 정보를 출력하는 함수
     * iter , printBooks메서드 사용
     */

    private static void showAllBooks() {
        System.out.println("*********  모든 도서 정보 **********");
        LibraryRepository rp = getRepository();//굳이 필요한가..?
        for (Book book : books) {
            printBooks(book);

        }
    }

    /**
     * 보조 메서드 printBooks
     *
     * @param book 요리책과 만화책을 구분해서 다운캐스팅 --> 범용적으로 쓰려면 출력 말고 book.info를 리턴하는 거 고려해보기.
     */

    private static void printBooks(Book book) {

        if (book instanceof CookBook) {
            book = (CookBook) book;
        } else {
            book = (CartoonBook) book;
        }
        System.out.println(book.info());


    }

    /**
     * 앞에 번호가 붙고, 그 번호로 도서 대여 버튼 이 눌림
     * 이미 빌린 책이면 빌린 책이여서 대여 안됨 출력
     * 만화책이면 연령검사
     * 요리책이면 쿠폰 유무확인후 추가
     * 대여 성공이면 도서가 성공적으로 대여되었습니다라고 출력~
     */

    private static void rentBook() {
        System.out.println("============ 대여가능한 도서 정보 ==================");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i].info());

        }
        int rentBookNumber = Integer.parseInt(input("- 대여할 도서 번호 입력")) - 1;
        Book rentTargetBook = books[rentBookNumber];
        boolean isRent = false;
        if (rentTargetBook.getIsrent() == RENT_FAIL) {
            if (rentTargetBook instanceof CartoonBook) {
                rentTargetBook = (CartoonBook) rentTargetBook;
                if (usr.getAge() >= ((CartoonBook) rentTargetBook).getAccessAge()) {
                    rentTargetBook.setIsrent(RENT_SUCCESS);
                    System.out.println("# 도서가 성공적으로 대여 되었습니다");
                } else {
                    System.out.println("# 연령제한으로 도서 대여 실패했습니다");
                }

            } else {
                if (((CookBook) rentTargetBook).isCoupon()) {
                    usr.setCouponCount(1);
                    rentTargetBook.setIsrent(RENT_SUCCESS_WITH_COUPON);
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                }

            }

        } else {
            System.out.println("이미 누군가 대여한 도서 입니다.");
        }


    }

    private static void searchBooks(String searchStandard) {
        String searchWord = input("# 검색어: ");
        System.out.printf("======== [%s]검색결과 ===========\n", searchWord);
        String search = "";
        if (searchStandard.equals(searchByTitle)) {

        for (Book book : books) {
            if (book.getTitle().contains(searchWord)) {
                printBooks(book);
            }
        }
        }else if (searchStandard.equals(searchByAuthor)){

            for (Book book : books) {
                if (book.getAuthor().contains(searchWord)) {
                    printBooks(book);
                }
            }

        }


    }
        public static String input (String message){
            System.out.print(message);
            return sc.nextLine();
        }


        public static LibraryRepository getRepository () {
            return repository;
        }

        public static void setRepository (LibraryRepository repository){
            LibraryView.repository = repository;
        }
}

