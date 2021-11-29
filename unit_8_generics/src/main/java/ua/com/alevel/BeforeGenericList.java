package ua.com.alevel;

public class BeforeGenericList {

    private Object[] objects = new Object[10];
    private Class elementClass = null;

    public BeforeGenericList() { }

    public BeforeGenericList(Class elementClass) {
        this.elementClass = elementClass;
    }

    public void add(Object element) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                if (elementClass != null) {
                    if (element.getClass().isAssignableFrom(elementClass)) {
                        objects[i] = element;
                    } else {
                        throw new RuntimeException("incorrect element type");
                    }
                } else {
                    objects[i] = element;
                }
                break;
            }
        }
    }

    public Object get(int index) {
        return objects[index];
    }
}
