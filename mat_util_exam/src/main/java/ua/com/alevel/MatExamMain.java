package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class MatExamMain {

    public static void main(String[] args) {
        System.out.println("MatExamMain.main");
        int sum = MathUtil.sum(10, 7);
        System.out.println("sum = " + sum);

        String s = "test";
        s = "test2";
        char[] chars = s.toCharArray();

        List<Parent> parents = new ArrayList<>();
        parents.add(new User());
        parents.add(new Customer());
    }
}
