package ua.com.alevel.controller;

import ua.com.alevel.dao.CustomerDao;
import ua.com.alevel.dao.CustomerDaoImpl;
import ua.com.alevel.entity.Customer;
import ua.com.alevel.service.CustomerService;
import ua.com.alevel.service.CustomerServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CustomerController {

    private final CustomerService service = new CustomerServiceImpl();

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your options:");
        menu();
        String option;
        while ((option = reader.readLine()) != null) {
            switchToCrudOperations(option, reader);
            menu();
        }
    }

    private void menu() {
        System.out.println();
        System.out.println("if you want create, please enter 1");
        System.out.println("if you want update, please enter 2");
        System.out.println("if you want delete, please enter 3");
        System.out.println("if you want select customer, please enter 4");
        System.out.println("if you want select all customer, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void switchToCrudOperations(String option, BufferedReader reader) throws IOException {
        switch (option) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll();
            case "0" -> System.exit(0);
            default -> System.out.println("incorrect input value");
        }
    }

    private void create(BufferedReader reader) throws IOException {
        System.out.println("CustomerController.create");
        System.out.println("Please, enter age:");
        String ageString = reader.readLine();
        int age = Integer.parseInt(ageString);
        System.out.println("Please, enter name:");
        String name = reader.readLine();
        System.out.println("Please, enter email:");
        String email = reader.readLine();
        Customer customer = new Customer();
        customer.setAge(age);
        customer.setName(name);
        customer.setEmail(email);
        service.create(customer);
    }

    private void update(BufferedReader reader) throws IOException {
        System.out.println("CustomerController.update");
        System.out.println("Please, enter id:");
        String id = reader.readLine();
        Customer customer = service.findById(id);
        System.out.println("Please, enter age:");
        String ageString = reader.readLine();
        int age = Integer.parseInt(ageString);
        System.out.println("Please, enter name:");
        String name = reader.readLine();
        customer.setAge(age);
        customer.setName(name);
        service.update(customer);
    }

    private void delete(BufferedReader reader) throws IOException {
        System.out.println("CustomerController.delete");
        System.out.println("Please, enter id:");
        String id = reader.readLine();
        service.delete(id);
    }

    private void findById(BufferedReader reader) throws IOException {
        System.out.println("CustomerController.findById");
        System.out.println("Please, enter id:");
        String id = reader.readLine();
        Customer customer = service.findById(id);
        System.out.println("customer = " + customer);
    }

    private void findAll() {
        System.out.println("CustomerController.findAll");
        List<Customer> customers = service.findAll();
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
    }
}
