package ru.example.projectx.root;

/**
 * Created by user on 22.07.2015.
 */
public class Root {
    private double a;
    private double b;
    private double c;

    public double[] getX() {
        return roots();
    }

    //поиск одного корня пи D = 0
    public double[] get_one_X() {
        return root();
    }

    public Root setA(double a) {
        this.a = a;
        return this;
    }
    public Root setB(double b) {
        this.b = b;
        return this;
    }
    public Root setC(double c) {
        this.c = c;
        return this;
    }

    public double discriminant() {
        return b*b - 4 * a * c;
    }

    private double[] roots() {
        System.out.println("Ваше уравнение:\n" + a + "x^2 + " + b + "x + " + c);
        System.out.println("D = " + discriminant());
        double d = discriminant();
        double x1 = (-b + Math.sqrt(d))/2*a;
        double x2 = (-b - Math.sqrt(d))/2*a;
        return new double[]{x1,x2};
    }
    private double[] root() {
        double x = ((-b)/2*a);
        return new double[]{x};
    }
}
