package sec8;

public class ExCircle {
    static int radius;
    static double pi = 3.14;
    
    protected void setRadius(int argNum) {
        radius = argNum;
    }
    
    protected double getArea() {
        return radius * radius * pi;
    }
}
