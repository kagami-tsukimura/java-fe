package sec8;

public class ExSquare {
    static int height;
    static int width;
    
    protected void setHeight(int heightValue) {
        height = heightValue;
    }
    
    protected void setWidth(int widthValue) {
        width = widthValue;
    }
    
    protected int getArea() {
        return height * width;
    }
}
