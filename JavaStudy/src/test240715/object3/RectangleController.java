package test240715.object3;


public class RectangleController {

    public RectangleController() {
        // 생성자
    }

    public String calcArea(int x, int y, int width, int height) {
        Rectangle r = new Rectangle(x, y, width, height);
        int area = width * height;
        return "사각형의 정보 : " + r.toString() + "\n사각형의 면적 : " + area;
    }

    public String calcPerimeter(int x, int y, int width, int height) {
        Rectangle r = new Rectangle(x, y, width, height);
        int perimeter = 2 * (width + height);
        return "사각형의 정보 : " + r.toString() + "\n사각형의 둘레 : " + perimeter;
    }
}