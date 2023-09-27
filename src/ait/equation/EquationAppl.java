package ait.equation;

import ait.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(5,3,7);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(0,0,0);
        QuadraticEquation quadraticEquation3 = new QuadraticEquation(45,73,18);
        quadraticEquation1.display();
        System.out.println("delta = " + quadraticEquation1.delta());
        System.out.println("quantity roots = " + quadraticEquation1.quantityRoots());
        quadraticEquation2.display();
        System.out.println("delta = " + quadraticEquation2.delta());
        System.out.println("quantity roots = " + quadraticEquation2.quantityRoots());
        quadraticEquation3.display();
        System.out.println("delta = " + quadraticEquation3.delta());
        System.out.println("quantity roots = " + quadraticEquation3.quantityRoots());


    }
}
