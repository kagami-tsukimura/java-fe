package sec8;

public class ExTriangle {
    static int height;
    static int bottom;

    protected void setHeight(int heightValue) {
        height = heightValue;
    }

    protected void setBottom(int bottomValue) {
        bottom = bottomValue;
    }

    protected int getArea() {
        return bottom * height / 2;
    }
}
