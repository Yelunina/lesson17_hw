package ait.equation.model;

/*
Создать класс QuadraticEquation в пакете ait.equation.model.
В этом классе определить поля private double a; private double b; private double c;.
Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
Создать геттеры и сеттеры. Создать метод public void display() для печати в консоль квадратного уравнения.
Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта
 и колличества решений уранения соотвественно. Создать клас EquationAppl в пакете ait.equation с методом main.
 В методе main создать несколько экземпляров QuadraticEquation
и вывести для каждого из них результаты работы методов display, delta, quantityRoots.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public int quantityRoots() {
        double delta = delta();
        if (delta == 0) {
            return 1;
        } else if (delta > 0) {
            return 2;
        } else {
            return 0;
        }
    }

    public void display() {
        System.out.println(a + "x^2 " + "+ " + b + "x " + "+ " + c + " = 0");

    }

}
