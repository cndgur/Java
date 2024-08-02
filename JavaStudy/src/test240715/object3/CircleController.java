package test240715.object3;

public class CircleController extends Point {
	public String calcArea(int x, int y, int radius) {
        Circle c = new Circle(x, y, radius);
        double area = Math.PI * radius * radius;
        return "원의 정보 : " + c.toString() + "\n원의 면적 : " + area;
    }

    public String calcCircum(int x, int y, int radius) {
        Circle c = new Circle(x, y, radius);
        double circum = 2 * Math.PI * radius;
        return "원의 정보 : " + c.toString() + "\n원의 둘레 : " + circum;
    }
}