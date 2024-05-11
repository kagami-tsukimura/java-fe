package sec8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        deleteFile();
        drawHeader();
        // Create Square
        Square square = new Square();
        square.defineSquare(200, 100, 100, 400, "blue");
        square.draw();

        // Create Circle
        Circle circle = new Circle("circle");
        circle.defineCircle(250, 300, 200, 100, "red");
        circle.draw();

        // Create Circle2
        Circle circle2 = new Circle("circle2");
        circle2.defineCircle(250, 100, 50, 50, "yellow");
        circle2.draw();

        // Create Circle3
        Circle circle3 = new Circle("circle3");
        circle3.defineCircle(250, 500, 50, 50, "yellow");
        circle3.draw();

        drawFooter();
    }

    private static void deleteFile(){
        Path p = Paths.get("shape.html");

        try{
            Files.deleteIfExists(p);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static void drawHeader(){
        String source =
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<meta charset=\"utf-8\">" +
                        "<title>SVG Test</title>" +
                        "</head>" +
                        "<body>" +
                        "<svg x=0 y=0 width=1000 height=1000 style=\"background-color: #fff\">";
        writeFile(source);
    }

    private static void drawFooter() {
        String source =
                "</svg>" +
                        "</body>" +
                        "</html>";
        writeFile(source);
    }

    private static void writeFile(String source) {
        try{
            File file = new File("shape.html");
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(source);
            filewriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}