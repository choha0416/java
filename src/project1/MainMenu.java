package project1;


import java.util.*;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private List<Movie> movies;
    private MovieInfo movieInfo;
    
    public MainMenu() {
    	movieInfo = new MovieInfo();
        movies = movieInfo.loadFile("C:\\Temp\\movies.txt");
    }

    public void menu() {
        while (true) {
            System.out.println("=====================영화 예매=======================");
            System.out.println("\t\t" + "1. 영화 예매하기");
            System.out.println("\t\t" + "2. 예매 확인하기");
            System.out.println("\t\t" + "3. 예매 취소하기");
            System.out.println("\t\t" + "4. 관리자 메뉴 이동");
            System.out.println("\t\t" + "5. 종료하기");

            System.out.print("\t\t" + "메뉴 선택: ");
            String cho = scanner.nextLine();
            System.out.println("===================================================");
            switch (cho) {
                case "1":
                	System.out.println("\t\t" +"영화를 예매합니다");
                	System.out.println();
                	new ReserveMovie(scanner, movies).execute();
                    break;
                case "2":
                	System.out.println("예매를 확인합니다");
                	new CheckReservation(scanner,movies).excute();
                    break;
                case "3":
                	System.out.println("예매를 취소합니다");
                	new CancelReservation(scanner,movies).excute();
                    break;
                case "4":
                    System.out.println("관리자 메뉴 이동 선택됨.");
                    System.out.println("구현중");
                    break;
                case "5":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}