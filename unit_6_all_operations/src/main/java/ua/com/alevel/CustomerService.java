package ua.com.alevel;

public class CustomerService {

    private Customer customer;
    private CustomerFacade customerFacade;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerFacade getCustomerFacade() {
        return customerFacade;
    }

    public void setCustomerFacade(CustomerFacade customerFacade) {
        this.customerFacade = customerFacade;
    }

    public void start() {
        CustomerFacade.initState(customer.getState());
        customerFacade.facading();
    }
}
