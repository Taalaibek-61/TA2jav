package oop.Ex_7.dataServise;

import oop.Ex_7.data.Komplex;


public class Calculate implements Operations {

    @Override
    public Komplex sum(Komplex number, Komplex number2) {
        return new Komplex(number.a + number2.a, number.b + number2.b);
    }

    @Override
    public Komplex raznoct(Komplex number, Komplex number2) {
        return new Komplex(number.a - number2.a, number.b - number2.b);
    }

    @Override
    public Komplex multy(Komplex number, Komplex number2) {
        return new Komplex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }

    @Override
    public Komplex div(Komplex number, Komplex number2) {
        return new Komplex((number.a * number2.a + number.b * number2.b) /
                (number2.a * number2.a + number2.b * number2.b),
                (number.b * number2.a - number.a * number2.b) /
                        (number2.a * number2.a + number2.b * number2.b));
    }
}