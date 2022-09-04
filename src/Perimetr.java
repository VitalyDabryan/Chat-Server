import static java.lang.Math.random;

public class Perimetr {
    public static void main(String[] args) {
        int treanleSquare, circleSquare, quadrateSquare;
        int t = (int) (Math.random() * 10);
        int q = (int) (Math.random() * 10);
        double radius = Math.random() * 10;

        System.out.println("Storona " + t + ", Perimetr triangle = " + Treangle(t));
        System.out.println("Storona " + q + ", Perimetr square = " + Quadrate (q));
        System.out.println("Radius " + radius + ", Perimetr circle = " + Circle (radius));
    }
    public static int Treangle(int t) {
        int treanleSquare = 3 * t;
        return treanleSquare;
    }
    public static double Circle (double radius) {
        double circleSquare = 2*3.14 * radius;
        return circleSquare;
    }
    public static int Quadrate (int q) {
        int quadrateSquare = 4 * q;
        return quadrateSquare;
    }
}
