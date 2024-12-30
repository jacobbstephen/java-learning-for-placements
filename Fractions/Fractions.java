import java.util.*;
class Fraction{
    public int nr, dr;

    public Fraction(int nr, int dr){
        if(dr == 0){
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.nr = nr;
        this.dr = dr;
    }
    public Fraction addFractions(Fraction other){
        int numer = this.nr * other.dr + this.dr * other.nr;
        int denomr = this.dr * other.dr;
        return new Fraction(numer, denomr);
    }
}
public class Fractions {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,3);
        Fraction res = f1.addFractions(f2);
        System.out.println(res.nr + " / " +  res.dr);
    }
}
