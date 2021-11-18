package ua.com.alevel;

public abstract class AbsClass {

    private String smt;

    protected abstract void some();

    public void test() {
        System.out.println("AbsClass.test");
    }

    public String getSmt() {
        return smt;
    }

    public void setSmt(String smt) {
        this.smt = smt;
    }
}
