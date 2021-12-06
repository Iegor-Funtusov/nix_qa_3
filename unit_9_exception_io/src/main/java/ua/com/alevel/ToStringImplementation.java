package ua.com.alevel;

import java.lang.reflect.Field;

public record ToStringImplementation(Object target, Class<?> targetClass) {

    public String toString() {
        System.out.println("ToStringImplementation.toString");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(targetClass.getSimpleName());
        stringBuilder.append(" : ");
        stringBuilder.append("{");
        Field[] declaredFields = targetClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            try {
                declaredField.setAccessible(true);
                Object value = declaredField.get(target);
                stringBuilder.append(declaredField.getName());
                stringBuilder.append(" = ");
                stringBuilder.append(value);
                stringBuilder.append(", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
