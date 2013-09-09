/**
 * @author Christian Soler
 * @class: CSCI 315 (Rhode Island College)
 * @date 9/5/13
 */
public class ComplexApp {
    /**
     * Fields
     */
    private Complex c1, c2, c3, c4, c5, c6, c7, c8, c9;

    public ComplexApp() {
        // instantiate objects
        c1 = new Complex(3, 2);
        c2 = new Complex();
        c3 = new Complex(2, 1);
        c4 = new Complex(0, 1);
        c5 = new Complex(1, 1);
        c6 = new Complex(-1, -1);
        c7 = new Complex(0, -1);
        c8 = new Complex(-1, 0);
        c9 = c1.add(c6);

        // print outs
        System.out.println(String.format("c1 = %s", c1.toString()));
        System.out.println(String.format("c2 = %s", c2.toString()));
        System.out.println(String.format("c3 = %s", c3.toString()));
        System.out.println(String.format("c4 = %s", c4.toString()));
        System.out.println(String.format("c5 = %s", c5.toString()));
        System.out.println(String.format("c6 = %s", c6.toString()));
        System.out.println(String.format("c7 = %s", c7.toString()));
        System.out.println(String.format("c8 = %s", c8.toString()));

        System.out.println(String.format("The magnitude of c1 = %.3f", c1.findMagnitude()));

        System.out.println(String.format("c1 + c6 = c9 = %s", c1.add(c6)));
        System.out.println(String.format("c1 - c6 = %s", c1.subtract(c6)));
        System.out.println(String.format("c1 times c6 = %s", c1.multiply(c6)));
        System.out.println(String.format("c1 and c2 are equal is: %s", c1.equals(c2)));
        System.out.println(String.format("c3 and c9 are equal is: %s", c3.equals(c1.add(c6))));

    }

    public static void main(String[] args) {
        new ComplexApp();
    }
}
