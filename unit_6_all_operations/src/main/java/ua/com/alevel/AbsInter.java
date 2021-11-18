package ua.com.alevel;

public interface AbsInter {

    public static final String smt = "smt";

    public abstract void some();

    public default void test() {
        System.out.println("AbsClass.test");
    }
}
