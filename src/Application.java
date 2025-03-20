public class Application {
    public static void main(String[] args) {

        Square square = new Square("red", 5.0f);
        Triangle triangle = new Triangle("blue", 4.0f, 6.0f);
        Circle circle = new Circle("green", 3.0f);

        Triangle tri1 = new Triangle("red", 2.0f, 1.1f);
        Circle c = new Circle("yellow", 1.5f);
        Square sq = new Square("blue", 1.2f);

        System.out.println("Area = " + tri1.getArea() + " details: " + tri1);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle("red", 2.0f, 1.1f);
        System.out.println("Triangle2 equals Triangle1: " + tri1.equals(tri2));

        Triangle tri3 = new Triangle("brown", 2.0f, 1.1f);
        System.out.println("Triangle3 equals Triangle1: " + tri1.equals(tri3));

        System.out.println("Numar de instante:"+ Form.getCounter());
    }
}
