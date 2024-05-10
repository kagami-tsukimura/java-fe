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
        Circle circle = new Circle();
        circle.defineCircle(250, 300, 200, 100, "red");
        Square square = new Square();
        square.defineSquare(200, 100, 100, 400, "blue");
        square.draw();
        circle.draw();
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