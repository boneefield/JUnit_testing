package ru.example.projectx.root;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Vakazov.R on 22.07.2015.
 */

public class Main {

    public static void main(String[] args) {
        Root root = new Root();
        printRoots(root,2,2,-4);
    }

    public static void printRoots(Root root, double a, int b, double c){
        root.setA(a).setB(b).setC(c);
        double[] answer = root.getX();
        int i = 0;
        for (double answers : answer) {
            double roundAnswer = new BigDecimal(answers).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
            i++;
            System.out.println("x"+i + " = " + roundAnswer);
        }
    }

}
