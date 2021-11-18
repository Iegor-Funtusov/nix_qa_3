package ua.com.alevel;

import ua.com.alevel.crud.CrudTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AllOperationsMain {

    public static void main(String[] args) {
        new CrudTest().test();
//        String someString = Customer.someString;
//        System.out.println(ConstClass.SOME1);
//        System.out.println(ConstClassEnum.SOME1);
//        System.out.println("AllOperationsMain.main");
//        AboutClass aboutClass = new AboutClass();
//        System.out.println("aboutClass = " + aboutClass.getField1());
//
//        aboutClass = new AboutClass("test1", "test2");
//        System.out.println("aboutClass = " + aboutClass.getField1());
//        aboutClass.test1();
//        aboutClass.test1("some1");
//        aboutClass.test1("some1", "some2");
//
//        System.out.println(Customer.someString);
//        Customer.someString = "NEW SOME SOME";
//        System.out.println(Customer.someString);

//        Customer customer = new Customer();
//        CustomerService customerService = new CustomerService();
//        customerService.setCustomer(customer);
//        CustomerFacade customerFacade = new CustomerFacade();
//        customerService.setCustomerFacade(customerFacade);
//        customerService.start();
//        Class aClass = aboutClass.getClass();
//        Field[] fields = aClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println("field = " + field.getName());
//        }
//        Method[] methods = aClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("method = " + method.getName());
//        }
//        Constructor[] constructors = aClass.getDeclaredConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println("constructor = " + constructor.getName());
//        }
    }
}
