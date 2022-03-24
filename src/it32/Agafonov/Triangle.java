package it32.Agafonov;

import org.apache.logging.log4j.*;

public class Triangle {
    static final Logger Logger = LogManager.getLogger(Triangle.class);
    double a, b, c;

    Triangle() {
    }


    Triangle(double a, double b, double c) {
        try {
            this.a = a;
            this.b = b;
            this.c = c;
        } catch (NullPointerException e) {
            System.out.println("Некорректные данные");
        }
    }

    boolean check() {
        return (a + b > c && a + c > b && b + c > a);
    }

    double area() {
        double p = (a + b + c) / 2;
        Logger.debug("Полупериметр треугольника:" + p);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
