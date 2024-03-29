package demo1;

public class Complex {

    private final double real;
    private final double imag;


    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;


        }
        if (!(o instanceof Complex c)) {
            return false;
        }

        return Double.compare(real, c.real) == 0 &&
                Double.compare(imag, c.imag) == 0;

    }

    @Override
    public String toString() {
        String sign = imag < 0 ? "-" : "+";

        return "(" + real + sign + Math.abs(imag) + "i";

    }

    public static void main(String[] args) {

        Complex a = new Complex(1, 0);
        Complex b = new Complex(1, 0);

        if (a.equals(b)) {
            System.out.println("'a' equals 'b'. ");

        } else {
            System.out.println("'a' and  'b' are not equals . ");
        }


        System.out.println("'a' = " +a);


        System.out.println("'b' = " +b);

    }

}
