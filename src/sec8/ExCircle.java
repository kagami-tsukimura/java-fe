package sec8;

public class ExCircle {
    static int radius;
    static double pi = 3.14;
    
    private static void setRadius(int argNum) {
        radius = argNum;
    }
    
    private static double getArea() {
        return radius * radius * pi;
    }
}
