//Unit test
package ru.example.projectx.rootTests;

import org.junit.*;
import ru.example.projectx.root.Root;
import java.util.Arrays;

/**
 * Created by Vakazov.R on 24.07.2015.
 */

public class UnitTest {
    Root root = new Root();

    @Test
    public void case01() {
        System.out.println("\nTest 01");
        root.setA(1).setB(2).setC(3);
        double[] rightRoots = {-1,3};
        double[] roots = root.getX();
        Assert.assertTrue(Arrays.equals(roots, rightRoots));
    }

    @Test
    public void case02() {
        System.out.println("\nTest 02");
        root.setA(1).setB(2).setC(3);
        double[] roots = root.getX();
        Assert.assertTrue("X1 = NaN", Double.isNaN(roots[0]));
        Assert.assertTrue("X1 = NaN", Double.isNaN(roots[1]));
    }

    @Test
    public void case03() {
        System.out.println("\nTest 03");
        root.setA(0).setB(1).setC(-2);
        double[] roots = root.getX();
        Assert.assertTrue("X != 2",roots[0] == -2);
    }

    //юнит-тесты.
    @Test
    public void case04(){
        System.out.println("Test 4");
        root.setA(2).setB(3).setC(1);
        double[] rroots = {0,5, -1};
        double[] roots = root.getX();
        Assert.assertTrue(Arrays.equals(roots, rroots));
    }

    //случай, когда корней нет
    @Test
    public void case05(){
        System.out.println("Test 5");
        root.setA(1).setB(4).setC(5);
        root.discriminant();
        if(root.discriminant() < 0){
            System.out.println("The negative discriminant");
        }
        else {
            double[] roots = root.getX();
            System.out.println("The equation has roots");
        }
    }
    //когда D = 0. + проверка на знак корня.
    @Test
    public void case06(){
        System.out.println("Test 6");
        root.setA(-1).setB(4).setC(-4);
        if(root.discriminant() == 0){
            System.out.println("discriminant = 0 -> 1 root");
            double[] roots = root.get_one_X();
            double[] roots2 = new double[0];
            if(roots[0] < 0){
                System.out.println("The root is negative");
                System.out.println(roots[0]);
            }
            if(roots[0] == 0){
                System.out.println("The root is 0");
                System.out.println(roots[0]);
            }
            if(roots[0] > 0){
                System.out.println("The root is positive");
                System.out.println(roots[0]);
            }
        }
    }
    //Rогда 1 из корней отрицательный
    @Test
    public void case07() {
        System.out.println("Test 7");
        root.setA(2).setB(6).setC(-6);
        double[] roots = root.getX();
        for (int i = 0; i < 2; i++) {
            if (roots[i] < 0) {
                System.out.println((i + 1) + " root is negative,  " + "x" + (i + 1) + " = " + roots[i]);
            }
        }
    }

    //2 отрицатлеьных корня
    @Test
    public void case08() {
        System.out.println("Test 7");
        root.setA(-6).setB(-5).setC(-1);
        double[] roots = root.getX();
        for (int i = 0; i < 2; i++) {
            if (roots[i] < 0) {
                System.out.println((i + 1) + " root is negative,  " + "x" + (i + 1) + " = " + roots[i]);
            }
        }
    }
}
