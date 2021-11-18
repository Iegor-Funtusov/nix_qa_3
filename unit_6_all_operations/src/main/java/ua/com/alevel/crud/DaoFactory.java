package ua.com.alevel.crud;

import org.reflections.Reflections;

import java.util.Set;

public class DaoFactory {

    private Reflections scanner = new Reflections("ua.com.alevel");

    public Object generateImplementationByInterface(Class<?> intrfc) {
        Set<Class<?>> subTypesOf = scanner.getSubTypesOf((Class<Object>) intrfc);
        for (Class<?> subClass : subTypesOf) {
            if (!subClass.isAnnotationPresent(Deprecated.class)) {
                try {
                    return subClass.getDeclaredConstructor().newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
