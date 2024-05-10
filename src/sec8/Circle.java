package sec8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Circle {
    int top, left, height, width;
    String color;

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

    private void execute(String htmlBody) {
        try {
            File file = new File("shape.html");
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(htmlBody);
            filewriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}