package ua.com.alevel;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

public class ReflectionTest {

    public void test() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("name");
        user.setAge(30);

        System.out.println("user = " + user);

        Class<? extends User> aClass = user.getClass();

        if (aClass.isAnnotationPresent(ToString.class)) {
            ToStringImplementation tsi = new ToStringImplementation(user, aClass);
            String s = tsi.toString();
            System.out.println("s = " + s);
        }




        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.getType().isAssignableFrom(Integer.class)) {
                if (declaredField.getName().equals("age")) {
                    try {
                        declaredField.set(user, 56);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (declaredField.getType().isAssignableFrom(String.class)) {
                if (declaredField.getName().equals("name")) {
                    try {
                        declaredField.set(user, "new name");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("user = " + user);

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Print.class)) {
                System.out.println("declaredMethod = " + declaredMethod.getName());
                declaredMethod.setAccessible(true);
                try {
                    declaredMethod.invoke(user);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
