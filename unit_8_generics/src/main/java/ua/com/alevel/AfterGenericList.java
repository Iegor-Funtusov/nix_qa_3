package ua.com.alevel;

public class AfterGenericList<S> {

    private Object[] objects = new Object[10];

    public void add(S element) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = element;
                break;
            }
        }
    }

    public S get(int index) {
        return (S) objects[index];
    }
}
