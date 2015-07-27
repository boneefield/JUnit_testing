package ru.example.projectx.rootTests;

import org.junit.*;
import ru.example.projectx.root.Root;
import java.util.Arrays;

/**
 * Created by 1 on 27.07.2015.
 */
public class unitAtLesson {
    Root root = new Root();

    @Test
    public void case01() {
        root.setA(-1).setB(2).setC(3);
        double[] roots = root.getX();
        double[] expected = {-1,3};
        Assert.assertTrue("Корни не соответствуют ожидаемому результату"
                ,Arrays.equals(roots,expected));
    }

    @Test
    public void case02() {
        root.setA(-1).setB(2).setC(3);
        double[] roots = root.getX();
        Assert.assertTrue(roots[0] == 1);
    }

    @Test
    public void case03() {
        root.setA(-1).setB(2).setC(3);
        double[] roots = root.getX();
        Assert.assertTrue(Double.isNaN(roots[0]));
        Assert.assertTrue(Double.isNaN(roots[1]));
    }
}
