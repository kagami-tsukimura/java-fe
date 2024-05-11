package sec8;

public class ExSquare {
    static int height;
    static int width;
    
    private static void setHeight(int heightValue) {
        height = heightValue;
    }
    
    private static void setWidth(int widthValue) {
        width = widthValue;
    }
    
    private static int getArea() {
        return height * width;
    }
}
