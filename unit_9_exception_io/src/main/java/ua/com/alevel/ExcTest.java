package ua.com.alevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcTest {

    public void test1() {
        test2();
        System.out.println("after test2");
    }

    public void test2() {
        try {
            test4(2, 1);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
//            throw new ArithmeticException("incorrect values");
        }
//        test3(2, 0);
        test5();
    }

    public void test3(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("incorrect values");
        }
        int res = a / b;
    }

    public void test4(int a, int b) throws Exception {
        int res = a / b;
    }

    public void test5() {
        try {
            int g = Integer.parseInt("56789j");
            int res = 10 / 0;
        } catch (RuntimeException e) {
//            log.error();
            System.out.println("RuntimeException = " + e.getMessage());
        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("ArithmeticException = " + e.getMessage());
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("NumberFormatException = " + e.getMessage());
//        }
    }
}
