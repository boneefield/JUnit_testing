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
        root.setA(-1).setB(2).setC(3);
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
}
