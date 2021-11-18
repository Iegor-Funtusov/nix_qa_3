package ua.com.alevel;

import java.lang.String;

public class AboutClass {

    private String field1;
    private String field2;
    private int a;
    private boolean b;
    private char ch;

    public AboutClass() {
//        System.out.println("field1 = " + field1);
//        System.out.println("field2 = " + field2);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("ch = " + ch);
//        System.out.println("ch = " + (int)ch);
    }

    // Overloading
    public AboutClass(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
//        setField1(field1);
//        this.setField2(field2);
    }

    public String getField1() {
//        String field1 = "bla bla";
        return this.field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void test1() {
        System.out.println("AboutClass.test1");
    }

    public void test1(String s) {
        System.out.println("AboutClass.test2");
        System.out.println("s = " + s);
    }

    public void test1(String s1, String s2) {
        System.out.println("AboutClass.test3");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
