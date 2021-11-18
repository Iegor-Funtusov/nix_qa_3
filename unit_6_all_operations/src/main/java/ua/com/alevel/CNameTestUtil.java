package ua.com.alevel;

public class CNameTestUtil {

    public static CName getTestCName() {
        CName cName = new CName();
        cName.setS1("s1");
        cName.setS2("s2");
        return cName;
    }

    public static CName getTestCNameWhereS1IsNull() {
        CName cName = new CName();
        cName.setS1(null);
        cName.setS2("s2");
        return cName;
    }
}
