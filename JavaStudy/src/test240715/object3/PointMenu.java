package test240715.object3;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	 public void mainMenu() {
	        while (true) {
	            System.out.println("====== 메인 메뉴 ======");
	            System.out.println("1. 원 관련 정보");
	            System.out.println("2. 사각형 관련 정보");
	            System.out.println("0. 프로그램 종료");
	            System.out.print("메뉴 선택: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // 개행 문자 제거

	            switch (choice) {
	                case 1:
	                    circleMenu();
	                    break;
	                case 2:
	                    rectangleMenu();
	                    break;
	                case 0:
	                    System.out.println("프로그램을 종료합니다.");
	                    return;
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	            }
	        }
	    }

	    public void circleMenu() {
	        System.out.println("====== 원 관련 정보 ======");
	        System.out.print("중심 x 좌표 입력: ");
	        int x = sc.nextInt();
	        System.out.print("중심 y 좌표 입력: ");
	        int y = sc.nextInt();
	        System.out.print("반지름 입력: ");
	        int radius = sc.nextInt();
	        sc.nextLine(); // 개행 문자 제거

	        System.out.println(cc.calcArea(x, y, radius));
	        System.out.println(cc.calcCircum(x, y, radius));
	    }

	    public void rectangleMenu() {
	        System.out.println("====== 사각형 관련 정보 ======");
	        System.out.print("좌상단 x 좌표 입력: ");
	        int x = sc.nextInt();
	        System.out.print("좌상단 y 좌표 입력: ");
	        int y = sc.nextInt();
	        System.out.print("너비 입력: ");
	        int width = sc.nextInt();
	        System.out.print("높이 입력: ");
	        int height = sc.nextInt();
	        sc.nextLine(); // 개행 문자 제거

	        System.out.println(rc.calcArea(x, y, width, height));
	        System.out.println(rc.calcPerimeter(x, y, width, height));
	    }

	    public static void main(String[] args) {
	        PointMenu menu = new PointMenu();
	        menu.mainMenu();
	    }
	}