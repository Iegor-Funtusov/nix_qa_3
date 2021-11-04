package ua.com.alevel;

import ua.com.alevel.controller.CustomerController;

import java.io.IOException;

public class StartOopMain {

    public static void main(String[] args) throws IOException {
        CustomerController controller = new CustomerController();
        controller.run();
    }
}
