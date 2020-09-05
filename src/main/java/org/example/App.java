package org.example;

public class App {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.abs.apply(-1111);
        int b = calc.devide.apply(3, 5);
        boolean c = calc.isPositive.test(8); //Predicate возврщает true или false
        int d = calc.minus.apply(4, 9);
        int e = calc.multiply.apply(3, 7);
        int f = calc.plus.apply(6, 2);
        int g = calc.pow.apply(2);

        calc.print.accept(a);
        calc.print.accept(b);
        calc.printer.accept(c); //Predicate возврщает true или false
        calc.print.accept(d);
        calc.print.accept(e);
        calc.print.accept(f);
        calc.print.accept(g);

    }
}