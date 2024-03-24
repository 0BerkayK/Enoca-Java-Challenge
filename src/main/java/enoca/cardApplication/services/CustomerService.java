package enoca.cardApplication.services;

import enoca.cardApplication.models.entities.Customer;

public interface CustomerService {
    Customer getCustomerById(Long customerId);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Long customerId, Customer customer);

    void deleteCustomer(Long customerId);

    /*AddCustomer*/
}
