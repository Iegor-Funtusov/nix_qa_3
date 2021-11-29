package ua.com.alevel;

public class ParameterMethod {

    public static Customer newInstance() {
        return new Customer();
    }

    public static <E> E newInstance(Class<E> eClass) {
        try {
            return eClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
