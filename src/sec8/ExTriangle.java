package sec8;

public class ExTriangle {
    static int height;
    static int bottom;

    private static void setHeight(int heightValue) {
        height = heightValue;
    }

    private static void setBottom(int bottomValue) {
        bottom = bottomValue;
    }

    private static int getArea() {
        return bottom * height / 2;
    }
}
