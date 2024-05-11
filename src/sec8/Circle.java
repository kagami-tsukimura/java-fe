package sec8;

public class Circle extends Shape {

    public void defineCircle(int topValue, int leftValue, int heightValue, int widthValue, String colorValue) {
        top = topValue;
        left = leftValue;
        height = heightValue;
        width = widthValue;
        color = colorValue;
    }

    public void draw() {
        String htmlBody = "<ellipse cx=" + left + " cy=" + top + " rx=" + width + " ry=" + height + " fill=" + color + " />";
        execute(htmlBody);
    }

}