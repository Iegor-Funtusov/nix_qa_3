package ua.com.alevel;

import com.google.gson.Gson;
import ua.com.alevel.res.ResponseContainer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GenericsMain {

    public static void main(String[] args) {

//        Class<Customer> customerClass = Customer.class;
//        for (Field declaredField : customerClass.getDeclaredFields()) {
//            if (declaredField.getName().equals("dibil")) {
//                throw new RuntimeException("incorrect field name");
//            }
//            System.out.println("declaredField = " + declaredField.getName());
//        }

        System.out.println("GenericsMain.main");
        BeforeGenericList list = new BeforeGenericList();
        list.add(1);
        list.add(1L);
        list.add(1.9d);
        list.add("10");

        for (int i = 0; i < 4; i++) {
            System.out.println("i = " + list.get(i));
        }

        list = new BeforeGenericList(String.class);
        list.add("");
        list.add("");
        list.add("");
        list.add("");
//        list.add(4); error!!!

        AfterGenericList<String> afterGenericList = new AfterGenericList<>();
        afterGenericList.add("val 1");
        afterGenericList.add("val 2");
        afterGenericList.add("val 3");
        afterGenericList.add("val 4");
        // afterGenericList.add(0); //error !!!!

        for (int i = 0; i < 4; i++) {
            System.out.println("i = " + afterGenericList.get(i));
            System.out.println("i = " + afterGenericList.get(i).getClass().getName());
        }

        Customer customer = ParameterMethod.newInstance(Customer.class);
        customer.setAge(10);
        customer.setName("name");

        System.out.println("customer = " + customer);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(UUID.randomUUID().toString(), "name1", 20));
        customers.add(new Customer(UUID.randomUUID().toString(), "name2", 21));
        customers.add(new Customer(UUID.randomUUID().toString(), "name3", 22));
        customers.add(new Customer(UUID.randomUUID().toString(), "name4", 23));

        ResponseContainer<Customer, Integer> container = new ResponseContainer<>();
        container.setData(customers);
        container.setStatus(200);

        Gson gson = new Gson();
        String json = gson.toJson(container);

        System.out.println("container = " + json);
    }
}
