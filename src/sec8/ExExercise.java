package sec8;

public class ExExercise {
    public static void main(String[] args) {
        ExCircle circle = new ExCircle();
        ExSquare square = new ExSquare();
        ExTriangle triangle = new ExTriangle();
        
        // define
        circle.setRadius(10);
        square.setHeight(32);
        square.setWidth(12);
        triangle.setBottom(20);
        triangle.setHeight(8);

        double[] area = new double[] {circle.getArea(), square.getArea(), triangle.getArea()};
        double result = 0;

        for(int i = 0; i < area.length; i++) {
            result += area[i];
        }

    }
}
