package sec8;

public class Square extends Shape {

    public void defineSquare(int topValue, int leftValue, int heightValue, int widthValue, String colorValue) {
        top = topValue;
        left = leftValue;
        height = heightValue;
        width = widthValue;
        color = colorValue;
    }

    public void draw(){
        String htmlBody = "<rect  x=" + left + " y=" + top + " width=" + width + " height=" + height + " fill=" + color + " />";
        execute(htmlBody);
    }


}