package sec8;

public class ExTriangle {
    static int height;
    static int bottom;

    protected static void setHeight(int heightValue) {
        height = heightValue;
    }

    protected static void setBottom(int bottomValue) {
        bottom = bottomValue;
    }

    protected static int getArea() {
        return bottom * height / 2;
    }
}
