package test240716.object1;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public void mainMenu() {
		System.out.println("====메뉴====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			this.circleMenu();
			break;
		case 2:
			this.rectangleMenu(); 
			
		}
				
		
	}
	
	public void  circleMenu() {
		
	}
}
