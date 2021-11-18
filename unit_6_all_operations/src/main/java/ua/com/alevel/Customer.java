package ua.com.alevel;

import java.math.BigDecimal;

public class Customer {

    private BigDecimal balance;
    public static String someString;
    private Object state;

    static {
        System.out.println("Customer.static initializer");
        someString = "OLD SOME SOME";
    }

    public Customer() {
        System.out.println("Customer.Customer");
        this.balance = new BigDecimal("00.00");
    }

    public Customer(BigDecimal balance) {
        this .balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Object getState() {
        return state;
    }
}
