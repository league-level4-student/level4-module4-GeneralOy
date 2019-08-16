package testingStuff;

final class Number {
    private final double real;
    private final double imaginary;
 
    public Number(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }
 
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
 
