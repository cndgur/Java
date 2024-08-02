package test240715.object3;

public class Circle {
	 private int x;
	    private int y;
	    private int radius;

	    public Circle() {
	        super();
	    }

	    public Circle(int x, int y, int radius) {
	        super();
	        this.x = x;
	        this.y = y;
	        this.radius = radius;
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getRadius() {
	        return radius;
	    }

	    public void setRadius(int radius) {
	        this.radius = radius;
	    }

	    @Override
	    public String toString() {
	        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	    }
	}
