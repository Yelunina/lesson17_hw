package ait.equation;

import ait.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(5,3,7);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(91,13,6);
        QuadraticEquation quadraticEquation3 = new QuadraticEquation(45,73,18);
        quadraticEquation1.display();
        System.out.println("Delta = " + quadraticEquation1.delta());
        System.out.println("Number of roots = " + quadraticEquation1.quantityRoots());


    }
}
