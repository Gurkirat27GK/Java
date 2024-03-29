
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw error
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int num) {
        this.numerator = num;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int num) {
        if (num == 0) {
            // Throw error
            return;
        }
        this.denominator = num;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    private void simplify() {
        // find hcf and divide both num and den by that
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);

        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void add(Fraction f2) {
        // First fraction is the fraction on which function is called
        // Second fraction is passed as arguments
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }
}
