package ua.com.alevel;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionIOMain {

    public static void main(String[] args) {
        System.out.println("ExceptionIOMain.main");

        // compile exception
        // runtime exception
        Throwable throwable;
        // 1. checked
        Exception exception;
        SQLException sqlException;
        IOException ioException;
        RuntimeException runtimeException;
        // 2. unchecked
        Error error;
        StackOverflowError stackOverflowError;
        OutOfMemoryError outOfMemoryError;
        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory();
        System.out.println("heapSize = " + heapSize);
        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        System.out.println("heapMaxSize = " + heapMaxSize);
        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        System.out.println("heapFreeSize = " + heapFreeSize);
        System.gc();

        // logic exception

//        div(1,0);

        new ExcTest().test1();
    }

    private static void div(int a, int b) {
        int div = 0;
        if (b == 0) {

        }
        div = a / b;
        System.out.println("div = " + div);
    }
}
