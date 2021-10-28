package ua.com.alevel;

import ua.com.alevel.classes.AccessClass;
import ua.com.alevel.data.BaseClass;
import ua.com.alevel.data.DataClass;
import ua.com.alevel.data.User;
import ua.com.alevel.immutable.ImmutableClass;
import ua.com.alevel.immutable.RecordClass;
import ua.com.alevel.staticcontext.ExtMathUtil;
import ua.com.alevel.staticcontext.MathUtil;
import ua.com.alevel.staticcontext.StaticClass;

import java.math.MathContext;

public class IntersectionMain {

    public static void main(String[] args) {
        System.out.println("IntersectionMain.main");

        AccessClass accessClass;

        DataClass dataClass = new DataClass();
//        BaseClass baseClass = new BaseClass();

        StaticClass staticClass = new StaticClass();
        staticClass.INT2 = 10;
        StaticClass.INT = 10;


        StaticClass.test();

        double sqrt = Math.sqrt(10);
        String s = "text".toUpperCase();

        User user1 = new User("test1");
        user1.setInn("INN1");
        System.out.println("user1 = " + user1.getName());
        System.out.println("user1 = " + user1.getInn());

        User user2 = new User("test2");
        user2.setInn("INN2");
        System.out.println("user2 = " + user2.getName());

        user2 = user1;
        System.out.println("user2 = " + user2.getName());
        System.out.println("user2 = " + user2.getInn());

        user2.setInn("new_INN");
        System.out.println("user1 = " + user1.getInn());

//        MathUtil.E
//        ExtMathUtil.E

        ImmutableClass immutableClass = new ImmutableClass("test", "pass");
        RecordClass recordClass = new RecordClass("test", "test", "blablabla");

        System.out.println("immutableClass = " + immutableClass.getLogin());
        System.out.println("recordClass = " + recordClass.login());
    }
}
