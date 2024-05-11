package sec8;

public class ExSquare {
    static int height;
    static int width;
    
    protected static void setHeight(int heightValue) {
        height = heightValue;
    }
    
    protected static void setWidth(int widthValue) {
        width = widthValue;
    }
    
    protected static int getArea() {
        return height * width;
    }
}
