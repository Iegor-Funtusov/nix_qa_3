package ua.com.alevel.sealedclass;

public sealed class SealedClass permits SealedClass1, SealedClass2 {

    private static class AAA {

    }

    private class InnerClass {

        private String val;
        private void test() {
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
            String val = "";
            test1();
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
            test2(val);
//        dif;osaijfas;oiufasp
        }

        private void test1() {
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
        }

        private void test2(String val) {
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
//        dif;osaijfas;oiufasp
        }
    }
}
