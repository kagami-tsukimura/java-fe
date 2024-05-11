package sec8;

public class ExCircle {
    static int radius;
    static double pi = 3.14;
    
    protected static void setRadius(int argNum) {
        radius = argNum;
    }
    
    protected static double getArea() {
        return radius * radius * pi;
    }
}
