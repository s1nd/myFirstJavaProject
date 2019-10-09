package hw_.complex;

public class Complex {
    double real = 0;
    double comp = 0;
    Complex(){};
    Complex(double real, double comp){
        this.real = real;
        this.comp = comp;
    }
    static Complex add(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.comp = a.comp + b.comp;
        return c;
    }
    static Complex subtract(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real - b.real;
        c.comp = a.comp - b.comp;
        return c;
    }
    static Complex multiply(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real * b.real + a.comp * b.comp;
        c.comp = a.comp *b.real + a.real * b.comp;
        return c;
    }
//    分母有理化 (a+bi)/(c+di)=(ac+bd)/(c*c+d*d) + (bc-ad)/(c*c+d*d)i
    static Complex divide(Complex a, Complex b){
        Complex c = new Complex();
//        c*c+d*d
        double fenmu = b.real * b.real + b.comp * b.comp;
//        ac+bd
        double realFenzi =  a.real * b.real + a.comp * b.comp;
//        bc-ad
        double compFenzi =  a.comp * b.real - a.real * b.comp;
        c.real = realFenzi/fenmu;
        c.comp = compFenzi/fenmu;
        return c;
    }
    static void printComp(Complex a){
       System.out.println(a.real + "+" +a.comp + "i");

    }

    public static void main(String []args){
        Complex a = new Complex(1,2);
        Complex b = new Complex(1,2);

        printComp(divide(a, b));
    }
}
