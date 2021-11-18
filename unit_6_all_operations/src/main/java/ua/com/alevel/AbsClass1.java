package ua.com.alevel;

public abstract class AbsClass1 {

    private String smt;

    protected abstract void some();

    public void test() {
        System.out.println("AbsClass1.test");
    }

    public String getSmt() {
        return smt;
    }

    public void setSmt(String smt) {
        this.smt = smt;
    }
}
