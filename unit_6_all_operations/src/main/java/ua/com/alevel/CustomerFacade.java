package ua.com.alevel;

public class CustomerFacade {

    private static Object state;

    public void facading() {
        System.out.println("state = " + state);
    }

    public static void initState(Object newState) {
        state = newState;
    }
}
