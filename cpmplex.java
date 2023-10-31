class Complex {
    double real, img;

    // constructor to initialize real and imaginary parts
    Complex(double r, double i) {
        this.real = r;
        this.img = i;
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double real = c1.real * c2.real - c1.img * c2.img;
        double img = c1.real * c2.img + c1.img * c2.real;
        return new Complex(real, img);
    }

    public void printComplexNumber() {
        System.out.println("Complex number: " + real + " + " + img + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1.2, 3.4);
        Complex c2 = new Complex(5.6, 7.8);
        Complex result = Complex.multiply(c1, c2);
        result.printComplexNumber();
    }
}
