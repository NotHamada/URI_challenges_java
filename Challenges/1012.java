import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Double[] values = new Double[3];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextDouble();
        }

        double a = values[0];
        double b = values[1];
        double c = values[2];

        double areaTriangle = (a * c) / 2;
        double areaCircle = 3.14159 * Math.pow(c, 2);
        double areaTrapezium = ((a + b) * c) / 2;
        double areaSquare = Math.pow(b, 2);
        double areaRectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);

        scanner.close();

    }

}